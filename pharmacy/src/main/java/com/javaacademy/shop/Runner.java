package com.javaacademy.shop;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        Drug paracetamol = Drug.builder()
                .name("Paracetamol")
                .price(BigDecimal.valueOf(250))
                .recipe(false)
                .build();
        log.info("Создали парацетамол: {}", paracetamol);

        Cash cash = new Cash();
        cash.addProductInCash(paracetamol);
        System.out.println("список товаров в кассе drug:");
        cash.prtCash();
    }
}
