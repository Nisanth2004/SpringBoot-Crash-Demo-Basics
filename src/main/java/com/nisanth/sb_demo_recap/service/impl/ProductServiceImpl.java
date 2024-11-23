package com.nisanth.sb_demo_recap.service.impl;

import com.nisanth.sb_demo_recap.model.Product;
import com.nisanth.sb_demo_recap.repository.ProductRepository;
import com.nisanth.sb_demo_recap.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product, Long id) {
        return productRepository.findById(id)
                .map(oldProduct -> {
                    oldProduct.setName(product.getName());
                    oldProduct.setDescription(product.getDescription());
                    oldProduct.setPrice(product.getPrice());
                   // oldProduct.setQuantity(product.getQuantity());
                    return productRepository.save(oldProduct);
                })
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }
    @Override
    public void deleteProduct(Long productId) {
        if(productRepository.findById(productId).isPresent()) {

            productRepository.deleteById(productId);
        }

    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {

        if(productRepository.findById(id).isPresent())
        {
            return productRepository.findById(id).orElseThrow();
        }
        return null;
    }

}



