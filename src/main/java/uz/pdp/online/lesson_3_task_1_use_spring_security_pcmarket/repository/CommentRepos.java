package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Comment;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection.CustomComment;


@RepositoryRestResource(path = "comment", excerptProjection = CustomComment.class)
public interface CommentRepos extends JpaRepository<Comment, Integer> {
}
