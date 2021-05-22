package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Category;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection.CustomCategory;


@RepositoryRestResource(path = "category", excerptProjection = CustomCategory.class)
public interface CategoryRepos extends JpaRepository<Category,Integer> {
}
