package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.InputProduct;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();

    Integer getSupplier();

    Integer getProductList();

    Integer getQuantity();

    Integer getAmount();
}
