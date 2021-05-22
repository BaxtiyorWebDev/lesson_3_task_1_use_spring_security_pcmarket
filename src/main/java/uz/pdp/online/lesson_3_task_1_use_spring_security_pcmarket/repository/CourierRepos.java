package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Courier;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection.CustomCourier;

@RepositoryRestResource(path = "courier", excerptProjection = CustomCourier.class)
public interface CourierRepos extends JpaRepository<Courier, Integer> {
}
