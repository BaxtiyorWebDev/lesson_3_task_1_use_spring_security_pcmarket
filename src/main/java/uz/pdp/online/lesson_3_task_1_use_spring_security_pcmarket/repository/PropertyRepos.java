package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Property;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection.CustomProperty;

@RepositoryRestResource(path = "property", excerptProjection = CustomProperty.class)
public interface PropertyRepos extends JpaRepository<Property, Integer> {


}
    