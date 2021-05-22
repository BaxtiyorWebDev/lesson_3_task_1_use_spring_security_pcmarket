package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Attachment;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Category;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    boolean isActive();

    double getPrice();

    Integer getGuaranty();

    String getInfo();

    Category getCategory();

    Attachment getAttachment();

    boolean isSale();

}
