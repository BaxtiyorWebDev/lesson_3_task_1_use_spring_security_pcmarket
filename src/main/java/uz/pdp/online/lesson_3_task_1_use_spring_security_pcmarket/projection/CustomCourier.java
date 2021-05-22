package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Courier;

@Projection(types = Courier.class)
public interface CustomCourier {

    Integer getId();

    String getFullName();

    String getEmail();

    String getMessage();
}
