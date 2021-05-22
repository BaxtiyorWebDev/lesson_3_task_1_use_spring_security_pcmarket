package uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.entity.Product;
import uz.pdp.online.lesson_3_task_1_use_spring_security_pcmarket.projection.CustomProduct;

import java.util.List;

@RepositoryRestResource(path = "product", excerptProjection = CustomProduct.class)
public interface ProductRepos extends JpaRepository<Product, Integer> {

    @RestResource(path = "byPrice")
    public Page<Product> findAllByPriceBetween(@Param("min_price") Double min, @Param("max_price") Double max, Pageable pageable);


    @Query(value = "select * from product pr join characteristics chr on pr.id=chr.product_id " +
            "join property pp on pp.characteristics_id=chr.id " +
            "where in pr.id:=list", nativeQuery = true)
    List<Product> allByProductList(List<Integer> list);

}
