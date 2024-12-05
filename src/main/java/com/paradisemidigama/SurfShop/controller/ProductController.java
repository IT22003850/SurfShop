package com.paradisemidigama.SurfShop.controller;

import com.paradisemidigama.SurfShop.model.Product;
import com.paradisemidigama.SurfShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService prodService;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return prodService.getAllProducts();
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        System.out.println("Received Product: " + product);
        return prodService.addProduct(product);
    }

    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable int id,@RequestBody Product product){
        return prodService.updateProduct(id,product);
    }

    @DeleteMapping("product/{id}")
    public void deleteProduct(@PathVariable int id){
        prodService.deleteProduct(id);
    }
}
