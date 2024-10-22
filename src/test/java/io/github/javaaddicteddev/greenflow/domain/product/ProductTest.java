package io.github.javaaddicteddev.greenflow.domain.product;

import org.junit.jupiter.api.Assertions;
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

    @Test
    public void shouldReceiveErrorWhenNewProductWithInvalidName() {
        final String expectedName = null;
        final var expectedDescription = "some descripption";
        final var expectedCategory = "some Category";
        final var expectedStackholder = "some stackholder";
        final var expectedErrorMessage = "'name' should not be null";
        final var expectedErrorCount = 1;

        final var actualProduct = Product.newProduct(
                expectedName, expectedDescription, expectedCategory, expectedStackholder);

        final var actualException = Assertions.assertThrows(DomainException.class, () -> actualProduct.validate());

        assertNull(actualProduct);
        assertThrows(NullPointerException.class, () -> actualProduct.getId());
        assertEquals(expectedErrorCount, actualException.getErrors());
        assertEquals(expectedErrorMessage, actualException.getErrors().get(0).getMessage());
    }
}