package com.generator.model;

import com.generator.enumerations.Origin;
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
public class Brand {
    private String name;
    private Origin origin;
    private String description;
}
