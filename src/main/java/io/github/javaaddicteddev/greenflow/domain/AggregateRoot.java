/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.javaaddicteddev.greenflow.domain;

/**
 *
 * @author rengoku
 * @param <ID>
 */
public class AggregateRoot<ID extends Identifier> extends Entity<ID> {
    
    public AggregateRoot(ID id) {
        super(id);
    }
    
}
