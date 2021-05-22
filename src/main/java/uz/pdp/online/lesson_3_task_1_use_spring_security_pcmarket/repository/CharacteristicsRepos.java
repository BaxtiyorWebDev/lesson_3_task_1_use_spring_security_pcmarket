package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Characteristics;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection.CustomCharacteristics;

@RepositoryRestResource(path = "characteristics", excerptProjection = CustomCharacteristics.class)
public interface CharacteristicsRepos extends JpaRepository<Characteristics, Integer> {
}
