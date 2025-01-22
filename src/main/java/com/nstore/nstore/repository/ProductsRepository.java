package com.nstore.nstore.repository;

import com.nstore.nstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductsRepository  extends JpaRepository<Product, Long> {

    
}
