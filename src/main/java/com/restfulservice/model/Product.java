package com.restfulservice.model;

import java.math.BigDecimal;

public class Product {
    private String id;
    private String description;
    private Integer price;

    public Product( String id,  String description,  Integer price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}





