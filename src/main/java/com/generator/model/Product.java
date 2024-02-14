package com.generator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Sample model.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private Integer quantity;
    private String description;
    private String serialNumber;
    private Brand brand;
}
