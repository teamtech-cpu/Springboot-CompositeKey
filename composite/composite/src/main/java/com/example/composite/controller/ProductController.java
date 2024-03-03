package com.example.composite.controller;

import com.example.composite.model.Product;
import com.example.composite.service.Impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.save(product);
    }
}
