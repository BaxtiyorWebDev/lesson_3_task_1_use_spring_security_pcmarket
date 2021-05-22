package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Order;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection.CustomOrder;

@RepositoryRestResource(path = "order", excerptProjection = CustomOrder.class)
public interface OrderRepos extends JpaRepository<Order, Integer> {
}
