package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration// required
@EnableWebSecurity // required
@EnableGlobalMethodSecurity(prePostEnabled = true) // preAuthorize anotationlari bor bo'lgan methodlar ishlashi uchun
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication() // xotirani o'zida saqlab turish
                .withUser("superAdmin").password(passwordEncoder().encode("superAdmin")).roles("SUPER_ADMIN")
                .and()
                .withUser("moderator").password(passwordEncoder().encode("moderator")).roles("MODERATOR")
                .and()
                .withUser("operator").password(passwordEncoder().encode("operator")).roles("OPERATOR");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                /*KO'P QATLAMLI ODAMLAR KIRADIGAN ROLELARNI BIRINCHI YOZISH KERAK, KETMA-KETLIK KATTA AHAMIYATGA EGA*/
                .csrf().disable()// dbga data add, edit,delete qilish uchun ruxsat
                .authorizeRequests()// requestlarni authorization qilish
                .antMatchers(HttpMethod.GET, "/api/order/**").hasAnyRole("OPERATOR", "SUPER_ADMIN", "MODERATOR")
                .antMatchers(HttpMethod.POST, "/api/product/**").hasAnyRole("SUPER_ADMIN", "MODERATOR")
                .antMatchers(HttpMethod.PUT, "/api/product/**").hasAnyRole("SUPER_ADMIN", "MODERATOR")
                .antMatchers("/api/**").hasRole("SUPER_ADMIN")
                .anyRequest()// har qanday requestni authorization qilish
                .authenticated()// har qanday requestni authenticated qilish(tekshirish kiritish)
                .and()
                .httpBasic();// http basic bilan tekshirish(default:form basic bo'yicha)
    }

    /*PAROLNI ENCODE QIIIB BERIB YUBORISH UCHUN*/
    @Bean
// bean qilish uchun u @configurationni ichida bo'lishi kerak
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
