/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.javaaddicteddev.greenflow.domain.product;

import io.github.javaaddicteddev.greenflow.domain.AggregateRoot;
import io.github.javaaddicteddev.greenflow.domain.Stackholder;
import java.util.UUID;

/**
 *
 * @author rengoku
 */
public class Product extends AggregateRoot<ProductID> {

    private String name;
    private String description;
    private Category category;
    private Stackholder currentOwner;

    private Product(
            ProductID anId,
            String name,
            String description,
            Category category,
            Stackholder currentOwner) {
        super(anId);
        this.name = name;
        this.description = description;
        this.category = category;
        this.currentOwner = currentOwner;
    }

    public Product newProduct(String aName, String aDescription, Category aCategory, Stackholder aCurrentOwner) {
        final var id = ProductID.unique();
        return new Product(id, aName, aDescription, aCategory, aCurrentOwner);
    }

    public ProductID getId() {
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
