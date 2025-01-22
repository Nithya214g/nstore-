package com.nstore.nstore.service;

import com.nstore.nstore.model.Product;
import com.nstore.nstore.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductsService {

    private ProductsRepository productsRepository;

    @Autowired
    public ProductsService(ProductsRepository repository) {
        this.productsRepository = repository;
    }
    public List<Product> getProducts() {
        return productsRepository.findAll();
    }
}
