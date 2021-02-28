package com.app.simpleapp.simpleapp.service.impl;

import com.app.simpleapp.simpleapp.entity.Product;
import com.app.simpleapp.simpleapp.repositories.ProductRepository;
import com.app.simpleapp.simpleapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.getProducts();
    }
}
