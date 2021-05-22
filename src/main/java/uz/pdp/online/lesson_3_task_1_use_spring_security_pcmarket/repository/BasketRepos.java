package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Basket;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection.CustomBasket;


@RepositoryRestResource(path = "basket", excerptProjection = CustomBasket.class)
public interface BasketRepos extends JpaRepository<Basket,Integer> {


}
