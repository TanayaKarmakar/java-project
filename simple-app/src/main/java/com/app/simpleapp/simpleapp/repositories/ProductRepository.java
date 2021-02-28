package com.app.simpleapp.simpleapp.repositories;

import com.app.simpleapp.simpleapp.entity.Product;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    List<Product> productList = new ArrayList<>();

    public void addProducts() {
        Product p1 = new Product();
        p1.setId(1l);
        p1.setName("Product1");
        p1.setDescription("This is product1");
        p1.setPrice(BigInteger.valueOf(245));
        productList.add(p1);
    }

    public List<Product> getProducts() {
        addProducts();
        return productList;
    }
}
