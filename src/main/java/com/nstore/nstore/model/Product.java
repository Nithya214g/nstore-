package com.nstore.nstore.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @JacksonXmlProperty(isAttribute = true)
    private Long id;

    private String title;

    private double price;

    private String description;

    private String category;

    private String image;

    public Product() {
    }

    public Product(Long id, String title, double price, String brand, String category, String image) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = brand;
        this.category = category;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
