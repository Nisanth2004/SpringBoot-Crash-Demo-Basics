package com.nisanth.sb_demo_recap.controller;

import com.nisanth.sb_demo_recap.model.Product;
import com.nisanth.sb_demo_recap.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts()
    {
        return productService.getProducts() ;
    }
}
