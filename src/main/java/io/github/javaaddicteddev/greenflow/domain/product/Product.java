/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.javaaddicteddev.greenflow.domain.product;

import java.util.UUID;

/**
 *
 * @author rengoku
 */
public class Product {
    private UUID id;
    private String name; 
    private String description;
    private Category category;
    private Stackholder currentOwner;

    public Product(UUID id, String name, String description, Category category, Stackholder currentOwner) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.currentOwner = currentOwner;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public Stackholder getCurrentOwner() {
        return currentOwner;
    }
    
    
}
