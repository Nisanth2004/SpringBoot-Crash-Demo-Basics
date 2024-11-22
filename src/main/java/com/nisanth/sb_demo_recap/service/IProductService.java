package com.nisanth.sb_demo_recap.service;

import com.nisanth.sb_demo_recap.model.Product;
import com.nisanth.sb_demo_recap.repository.ProductRepository;

public interface IProductService {

    void addProduct(Product product);
}
