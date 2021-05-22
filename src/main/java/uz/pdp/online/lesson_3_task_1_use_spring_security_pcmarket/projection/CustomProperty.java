package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Property;

@Projection(types = Property.class)
public interface CustomProperty {

    Integer getId();

    String getName();

    Integer getCharacteristics();

}
