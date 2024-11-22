package com.nisanth.sb_demo_recap.repository;

import com.nisanth.sb_demo_recap.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
