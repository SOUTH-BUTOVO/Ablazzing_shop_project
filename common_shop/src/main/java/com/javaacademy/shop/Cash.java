package com.javaacademy.shop;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * Касса
 */
@ToString
public class Cash {
    private List<Product> soldProduct = new ArrayList<>();

    public void addProductInCash(Product product) {
        this.soldProduct.add(product);
    }

    public void prtCash() {
        System.out.println(this.soldProduct);
    }
}
