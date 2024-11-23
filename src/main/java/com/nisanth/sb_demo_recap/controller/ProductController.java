package com.nisanth.sb_demo_recap.controller;

import com.nisanth.sb_demo_recap.model.Product;
import com.nisanth.sb_demo_recap.service.ProductService;
import com.nisanth.sb_demo_recap.service.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}/product")
    public Product getProductById(@PathVariable Long id)
    {
     return productService.getProductById(id);
    }

    @PostMapping("/add/product")
    public Product addProduct(@RequestBody Product product)
    {
        return productService.addProduct(product);
    }

    @PutMapping("/update/product")
    public Product updateProduct(@RequestBody Product product,@RequestParam Long id)
    {
        return productService.updateProduct(product,id);
    }


    @DeleteMapping("/{id}/delete")
    public void deleteProduct(@PathVariable Long id)
    {
         productService.deleteProduct(id);
    }
}
