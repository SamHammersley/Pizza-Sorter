package uk.ac.tees.username.pizza;

public class LargePizza extends Pizza {
	
	public static final int LARGE_SIZE = 15;
	
	private String crust, thickness;

	public LargePizza(String topping1, String topping2, String crust, String thickness) {
		super(LARGE_SIZE, topping1, topping2);
		this.crust = crust;
		this.thickness = thickness;
	}
	
	@Override
	public String toString() {
		return super.toString() + " and a " + crust + " crust, " + thickness;
	}

}
