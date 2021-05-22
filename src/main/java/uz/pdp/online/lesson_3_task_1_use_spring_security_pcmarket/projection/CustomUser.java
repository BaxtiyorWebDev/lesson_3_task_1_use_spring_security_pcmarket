package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.User;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getName();

    String getAddress();

    String getPhoneNumber();

    String getEmail();

}
