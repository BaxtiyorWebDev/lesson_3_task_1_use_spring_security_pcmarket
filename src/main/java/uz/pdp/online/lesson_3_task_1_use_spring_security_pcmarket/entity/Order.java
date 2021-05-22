package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Integer id;

    private Date date;

    @OneToOne
    private Basket basket;

    private boolean isActive;

    private String commentText;

    private String detail;
}
