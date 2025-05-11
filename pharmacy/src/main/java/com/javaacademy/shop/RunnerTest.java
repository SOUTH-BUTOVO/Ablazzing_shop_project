package com.javaacademy.shop;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class RunnerTest {
    public static void main(String[] args) {
        Drug lorotadine = Drug.builder()
                .name("Lorotadine")
                .price(BigDecimal.valueOf(500))
                .recipe(true)
                .build();
        log.info("Создали лоротадин: {}", lorotadine);

        Cash cash = new Cash();
        cash.addProductInCash(lorotadine);
        System.out.println("список товаров в кассе test:");
        cash.prtCash();
    }
}
