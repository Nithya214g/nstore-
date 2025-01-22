package com.nstore.nstore.controller;

import com.nstore.nstore.model.Product;
import com.nstore.nstore.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    private final ProductsService productsService;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }


    // Get all Products
    @GetMapping
    public List<Product> getProducts() {
        return productsService.getProducts();
    }

}
