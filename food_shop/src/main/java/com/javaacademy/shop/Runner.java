package com.javaacademy.shop;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        Food apple = new Food("Яблоко", 50, BigDecimal.valueOf(100));

        Food pizza = Food.builder()
                .name("Пицца")
                .numberCalories(549)
                .price(BigDecimal.valueOf(500))
                .build();

        log.info("Создали яблоко: {}", apple);
        log.info("Создали пиццу: {}", pizza);

        Cash cash = new Cash();
        cash.addProductInCash(apple);
        cash.addProductInCash(pizza);
        System.out.println("список товаров в кассе food:");
        cash.prtCash();
    }
}
