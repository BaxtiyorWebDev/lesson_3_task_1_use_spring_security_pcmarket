package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.User;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection.CustomUser;

@RepositoryRestResource(path = "user", excerptProjection = CustomUser.class)
public interface UserRepos extends JpaRepository<User, Integer> {
}
