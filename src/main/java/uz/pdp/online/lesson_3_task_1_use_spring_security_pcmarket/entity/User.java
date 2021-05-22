package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String address;

    private String phoneNumber;

    private String email;

}
