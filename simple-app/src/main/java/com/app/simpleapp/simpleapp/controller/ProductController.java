package com.app.simpleapp.simpleapp.controller;

import com.app.simpleapp.simpleapp.entity.Product;
import com.app.simpleapp.simpleapp.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private Logger logger = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        logger.info("fetching product details");
        return productService.getProducts();
    }
}
