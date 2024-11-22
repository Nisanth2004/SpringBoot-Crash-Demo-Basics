package com.nisanth.sb_demo_recap.service;

import com.nisanth.sb_demo_recap.model.Product;
import com.nisanth.sb_demo_recap.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    /*private final List<Product> products= Arrays.asList(
            new Product(1L,"MacBook Air M1",100,"Best Lap"),
            new Product(2L,"MacBook Air M2",1000,"Best "),
            new Product(3L,"MacBook Air M3",100980,"Best Lap"),
            new Product(4L,"MacBook Air M4",99999,"Best Lap")
    );*/
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    /*//@PostConstruct
    public List<Product> saveProduct()
    {
        return productRepository.saveAll(products);
    }
}*/

}
