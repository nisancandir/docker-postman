package com.restfulservice.controller;

import com.restfulservice.model.Product;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
@RestController
public class ProductController {

    public List<com.restfulservice.model.Product> result = new ArrayList<com.restfulservice.model.Product>();

    @PostMapping("/product")
    public String createProduct(@RequestBody final com.restfulservice.model.Product product) {
        System.out.println(product.toString());
        //String newProducts = product.toString();
        //result.add(product);
        result.add(product);
        return "product saved succesfully";
    }

    @GetMapping("/product")
    public List<com.restfulservice.model.Product> getAllProducts() {

        return result;
    }

    @GetMapping("/product/{id}")
    public String getProductById(@PathVariable String id) {
        System.out.println(id);
        for (com.restfulservice.model.Product product : result) {
            if (product.getId().equals(id)) {
                return product.toString();
            }
        }


        return "no product by that id exits";
    }

    @PatchMapping("/product")
    public String patchProduct(@RequestBody Product product) {
        String nid = product.getId();
        for (Product products : result) {
            if (products.getId().equals(nid)) {
                products.setDescription(product.getDescription());
                products.setPrice(product.getPrice());
                return products.toString();
            }
        }
        return "no product by that id exits";
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable String id) {

        for(int j = 0; j < result.size(); j++)
        {
            Product obj = result.get(j);

            if(obj.getId().equals(id)){
                //found, delete.
                result.remove(j);
                return "product deleted";
            }

        }
        return "no product by that id exits";
    }

}
