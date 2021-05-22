package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Supplier;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection.CustomSupplier;

@RepositoryRestResource(path = "supplier", excerptProjection = CustomSupplier.class)
public interface SupplierRepos extends JpaRepository<Supplier, Integer> {
}
