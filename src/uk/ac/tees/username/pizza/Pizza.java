/** A class defining a pizza.
 *
 * Based on work created by Mark Truran.
 * September 2018
 * AJP class
 */

package uk.ac.tees.username.pizza;

public abstract class Pizza {

	/**
	 * The radius of the pizza, in inches.
	 */
	protected int radius;

	/**
	 * The first pizza topping.
	 */
	protected String topping1;

	/**
	 * The second pizza topping.
	 */
	protected String topping2;

	/**
	 * Initialises a generic pizza object.
	 * 
	 * @param radius
	 *            the radius of the pizza
	 * @param topping1
	 *            the first topping on the pizza
	 * @param topping2
	 *            the second topping on the pizza
	 */
	public Pizza(int radius, String topping1, String topping2) {
		this.radius = radius;
		this.topping1 = checkNotNull(topping1);
		this.topping2 = checkNotNull(topping2);
	}
	
	public <T> T checkArgument(T arg, T invalid) {
		if (arg.equals(invalid)) {
			throw new RuntimeException();
		}
		return arg;
	}
	
	public <T> T checkNotNull(T arg) {
		return checkArgument(arg, null);
	}

	/**
	 * This method gets the radius of the pizza, in inches.
	 * 
	 * @return the radius of the pizza, in inches
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * This method returns a textual description of the pizza.
	 *
	 * @return A textual description of the pizza
	 */
	@Override
	public String toString() {
		return "A pizza (" + radius + " inches) with " + topping1 + " and " + topping2;
	}
	
	public static Pizza parse(String input) {
		String[] args = input.split(" ");
		int radius = Integer.parseInt(args[0]);
		
		switch(radius) {
			case SmallPizza.SMALL_SIZE:
				return new SmallPizza(args[1], args[2]);
			case MediumPizza.MEDIUM_SIZE:
				return new MediumPizza(args[1], args[2], args[3]);
			case LargePizza.LARGE_SIZE:
				return new LargePizza(args[1], args[2], args[3], args[4]);
				
			default:
				return null;
		}
	}
	
}