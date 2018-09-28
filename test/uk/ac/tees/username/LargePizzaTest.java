package uk.ac.tees.username;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uk.ac.tees.username.pizza.LargePizza;

public class LargePizzaTest {
	
    /**
     * Testing the toString method.
     */
    @Test
    public void testToString()
    {
        System.out.println("Check toString output in SmallPizza");
        String expectedResult, actualResult;
        final LargePizza sp = new LargePizza("sausage", "bacon", "cheese", "deep-pan");
        expectedResult = "A pizza (15 inches) with sausage and bacon and a cheese crust, deep-pan";
        actualResult = sp.toString();
        System.out.println(expectedResult);
        System.out.println(actualResult);
        assertEquals(expectedResult, actualResult);
    }

}