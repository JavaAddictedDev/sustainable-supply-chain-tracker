package io.github.javaaddicteddev.greenflow.domain.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    public void shouldCreateNewProductWhenValidParamsIsGiven() {
        //given
        final var expectedName = "some product";
        final var expectedDescription = "some description";
        final var expectedCategory = "some category";
        final var expectedStackholder = "some stackholder";
        // when
        final var product = Product.newProduct(
                expectedName, expectedDescription, expectedCategory, expectedStackholder);
        //then
        assertNotNull(product.getId());
        assertEquals(expectedName, product.getName());
        assertEquals(expectedDescription, product.getDescription());
        assertEquals(expectedCategory, product.getCategory());
        assertEquals(expectedStackholder, product.getCurrentOwner());
    }
}