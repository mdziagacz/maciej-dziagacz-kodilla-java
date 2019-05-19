package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(2)
                .sauce("standard")
                .ingredients("cheese")
                .ingredients("cheese")
                .ingredients("onion")
                .ingredients("cucumber")
                .ingredients("chili")
                .builder();
        System.out.println(bigmac);

        //When
        int ingredientsQuantity = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(5, ingredientsQuantity);
    }
}
