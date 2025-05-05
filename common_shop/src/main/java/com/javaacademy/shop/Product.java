package com.javaacademy.shop;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
@RequiredArgsConstructor
public class Product {
    @NonNull
    private final BigDecimal price;
    @NonNull
    private final String name;
}
