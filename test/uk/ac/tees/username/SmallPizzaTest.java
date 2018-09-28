/** A set of test cases to check the output of the SmallPizza class.
 *
 * Based on work created by Mark Truran.
 * September 2018
 * AJP class
 */

package uk.ac.tees.username;

import static org.junit.Assert.*;
import org.junit.Test;

import uk.ac.tees.username.pizza.SmallPizza;

public class SmallPizzaTest
{    
    /**
     * Testing the toString method.
     */
    @Test
    public void testToString()
    {
        System.out.println("Check toString output in SmallPizza");
        String expectedResult, actualResult;
        final SmallPizza sp = new SmallPizza("cheese", "tomato");
        expectedResult = "A pizza (9 inches) with cheese and tomato";
        actualResult = sp.toString();
        //System.out.println(expectedResult);
        //System.out.println(actualResult);
        assertEquals(expectedResult, actualResult);
    }
}
