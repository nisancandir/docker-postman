package com.restfulservice.service;

import com.restfulservice.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    // read operation
    List<Product> fetchProductList();

    // update operation
    Product updateProduct(Product product, String productId);

    // delete operation
    void deleteProductById(String ProductId);
}
