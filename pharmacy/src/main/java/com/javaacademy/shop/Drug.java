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
public class Drug extends Product {
    @NonNull
    private final boolean recipe;

    public Drug(String name, BigDecimal price, boolean recipe) {
        super(price, name);
        this.recipe = recipe;
    }
}
