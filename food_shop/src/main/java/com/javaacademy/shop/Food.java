package com.javaacademy.shop;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class Food extends Product {
    @NonNull
    private final Integer numberCalories;

    public Food(String name, Integer numberCalories, BigDecimal price) {
        super(price, name);
        this.numberCalories = numberCalories;
    }
}
