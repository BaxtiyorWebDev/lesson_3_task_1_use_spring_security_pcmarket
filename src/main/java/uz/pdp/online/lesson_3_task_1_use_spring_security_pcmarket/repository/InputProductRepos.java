package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.InputProduct;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection.CustomInputProduct;

@RepositoryRestResource(path = "inputProduct", excerptProjection = CustomInputProduct.class)
public interface InputProductRepos extends JpaRepository<InputProduct, Integer> {
}
