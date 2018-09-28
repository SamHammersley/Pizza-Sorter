package uk.ac.tees.username;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uk.ac.tees.username.pizza.MediumPizza;

public class MediumPizzaTest {
	
    /**
     * Testing the toString method.
     */
    @Test
    public void testToString()
    {
        System.out.println("Check toString output in SmallPizza");
        String expectedResult, actualResult;
        final MediumPizza sp = new MediumPizza("ham", "pineapple", "cheese");
        expectedResult = "A pizza (12 inches) with ham and pineapple and a cheese crust";
        actualResult = sp.toString();
        System.out.println(expectedResult);
        System.out.println(actualResult);
        assertEquals(expectedResult, actualResult);
    }

}