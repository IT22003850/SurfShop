package com.paradisemidigama.SurfShop.repository;



import com.paradisemidigama.SurfShop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}
