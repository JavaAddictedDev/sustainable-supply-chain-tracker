/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.javaaddicteddev.greenflow.domain.product;

import io.github.javaaddicteddev.greenflow.domain.AggregateRoot;
import io.github.javaaddicteddev.greenflow.domain.Stackholder;
import io.github.javaaddicteddev.greenflow.domain.validation.ValidationHandler;

import java.util.UUID;

/**
 *
 * @author rengoku
 */
public class Product extends AggregateRoot<ProductID> {

    private String name;
    private String description;
    private String category;
    private String currentOwner;

    private Product(
            ProductID anId,
            String aName,
            String aDescription,
            String aCategory,
            String aCurrentOwner) {
        super(anId);
        this.name =  aName;
        this.description = aDescription;
        this.category = aCategory;
        this.currentOwner = aCurrentOwner;
    }

    public static Product newProduct(String aName, String aDescription, String aCategory, String aCurrentOwner) {
        final var id = ProductID.unique();
        return new Product(id, aName, aDescription, aCategory, aCurrentOwner);
    }

    @Override
    public void validate(final ValidationHandler aHandler) {
        new UserValidator(aHandler).validate();
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

    public String getCategory() {
        return category;
    }

    public String getCurrentOwner() {
        return currentOwner;
    }
    
    
}
