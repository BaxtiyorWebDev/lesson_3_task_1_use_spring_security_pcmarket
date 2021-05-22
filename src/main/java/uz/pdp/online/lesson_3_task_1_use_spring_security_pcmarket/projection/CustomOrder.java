package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Order;

import java.sql.Date;

@Projection(types = Order.class)
public interface CustomOrder {

    Integer getId();

    Date getDate();

    Integer getBasket();

    boolean isActive();

    String getCommentText();

    String getDetail();


}
