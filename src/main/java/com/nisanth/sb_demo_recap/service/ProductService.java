package com.nisanth.sb_demo_recap.service;

import com.nisanth.sb_demo_recap.model.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);
    Product updateProduct(Product product,Long id);
    void deleteProduct(Long productId);
    List<Product> getProducts();

    Product getProductById(Long id);
}
