package com.paradisemidigama.SurfShop.service;

import com.paradisemidigama.SurfShop.model.Product;
import com.paradisemidigama.SurfShop.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo prodRepo;


    public List<Product> getAllProducts() {
        return prodRepo.findAll();
    }

    public Product addProduct(Product product) {
        return prodRepo.save(product);
    }

    public Product updateProduct(int id, Product product) {
        product.setId(id);
        return prodRepo.save(product);
    }

    public void deleteProduct(int id) {
         prodRepo.deleteById(id);
    }
}
