/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.javaaddicteddev.greenflow.domain;

import io.github.javaaddicteddev.greenflow.domain.validation.ValidationHandler;

import java.util.Objects;

/**
 *
 * @author rengoku
 */
public abstract class Entity<ID extends Identifier> {

    protected final ID id;

    protected Entity(final ID id) {
        Objects.requireNonNull(id, "'Id' should not be null.");
        this.id = id;
    }

    public abstract void validate(ValidationHandler aHandler);

    public ID getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entity<?> other = (Entity<?>) obj;
        return Objects.equals(this.id, other.id);
    }

}
