package com.example.composite.service.Iiml;

import com.example.composite.model.Product;
import com.example.composite.repository.ProductRepository;
import com.example.composite.service.Impl.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    @Override
    public Product save(Product product) {
        return null;
    }
}
