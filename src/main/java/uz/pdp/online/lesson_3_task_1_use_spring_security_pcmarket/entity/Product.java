package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private boolean active;

    private double price;

    private Integer guaranty;

    private String info;

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment attachment;

    private boolean isSale;

}
