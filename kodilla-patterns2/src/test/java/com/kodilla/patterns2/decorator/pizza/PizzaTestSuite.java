package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PizzaTestSuite {
    @Test
    public void testPizzaTripleCheeseChickenSausageOnionGetPrice() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new CheeseDecorator(pizza);
        pizza = new ChickenDecorator(pizza);
        pizza = new SausageDecorator(pizza);
        pizza = new OnionDecorator(pizza);

        //When
        BigDecimal price = pizza.getPrice();

        //Then
        Assert.assertEquals(new BigDecimal(32), price);
    }

    @Test
    public void testPizzaTripleCheeseChickenSausageOnionGetDescritpion() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new CheeseDecorator(pizza);
        pizza = new ChickenDecorator(pizza);
        pizza = new SausageDecorator(pizza);
        pizza = new OnionDecorator(pizza);

        //When
        String description = pizza.getDescription();

        //Then
        Assert.assertEquals("margherita + cheese + cheese + chicken + sausage + onion", description);
    }
}
