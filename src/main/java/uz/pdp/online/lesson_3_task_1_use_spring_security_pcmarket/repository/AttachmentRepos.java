package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Attachment;

public interface AttachmentRepos extends JpaRepository<Attachment, Integer> {
}
