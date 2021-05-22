package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getName();

    Integer parentCategoryId();



}
