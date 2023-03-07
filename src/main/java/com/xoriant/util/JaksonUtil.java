package com.xoriant.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xoriant.model.Product;

public class JaksonUtil {

    public String toJson(Product product){
        String json=null;
        try {

            json=new ObjectMapper().writeValueAsString(product);

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return json;
    }

    public Product fromJson(String productJson) {
        Product product = null;
        try {

            product=new ObjectMapper().readValue(productJson,Product.class);

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return product;
    }
}
