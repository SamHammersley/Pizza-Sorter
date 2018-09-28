/** A class defining a small pizza.
 *
 * Based on work created by Mark Truran.
 * September 2018
 * AJP class
 */

package uk.ac.tees.username.pizza;

public class SmallPizza extends Pizza
{

	public static final int SMALL_SIZE = 9;
	
    /**
     * Initialises a small pizza object.
     *
     * @param radius the radius of the pizza, in inches
     * @param topping1 the first topping on the pizza
     * @param topping2 the second topping on the pizza
     */
    public SmallPizza(String topping1, String topping2)
    {
        super(SMALL_SIZE, topping1, topping2);
    }

}