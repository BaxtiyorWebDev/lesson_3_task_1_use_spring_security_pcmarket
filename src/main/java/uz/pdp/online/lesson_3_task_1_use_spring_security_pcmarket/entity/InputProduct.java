package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class InputProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Supplier supplier;

    @OneToMany
    private List<Product> productList;

    private Integer quantity;

    private Integer amount;
}
