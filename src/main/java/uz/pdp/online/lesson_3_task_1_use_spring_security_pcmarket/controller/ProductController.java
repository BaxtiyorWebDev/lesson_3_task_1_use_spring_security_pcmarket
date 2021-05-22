package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Product;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.payload.PropertyDto;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository.ProductRepos;


import java.util.List;

@RestController
@RequestMapping("/product/sort")
public class ProductController {

    @Autowired
    ProductRepos productRepos;

    @GetMapping
    public List<Product> getProducts(@RequestBody PropertyDto propertyDto) { // private List<Integer> propertiesId;
        List<Product> products = productRepos.allByProductList(propertyDto.getPropertiesId());
        return products;
    }

}
