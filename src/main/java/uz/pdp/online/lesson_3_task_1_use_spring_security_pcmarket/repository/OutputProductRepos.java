package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.OutputProduct;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepos extends JpaRepository<OutputProduct, Integer> {
}
