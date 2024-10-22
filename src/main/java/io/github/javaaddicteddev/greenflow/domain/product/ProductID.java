/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.javaaddicteddev.greenflow.domain.product;

import io.github.javaaddicteddev.greenflow.domain.Identifier;
import java.util.UUID;

/**
 *
 * @author rengoku
 */
public class ProductID extends Identifier {

    private final String value;

    public String getValue() {
        return value;
    }

    private ProductID(final String value) {
        this.value = value;
    }
    
    public static ProductID unique() {
        return ProductID.from(UUID.randomUUID());
    }
    
    public static ProductID from(final String anId) {
        return new ProductID(anId);
    }
    
    public static ProductID from(final UUID anId) {
        return new ProductID(anId.toString().toLowerCase());
    }

}
