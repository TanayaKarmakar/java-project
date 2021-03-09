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

        Product p2 = new Product();
        p2.setId(2l);
        p2.setName("product2");
        p2.setDescription("This is product2");
        p2.setPrice(BigInteger.valueOf(89));
        productList.add(p1);
        productList.add(p2);
    }

    public List<Product> getProducts() {
        addProducts();
        return productList;
    }
}
