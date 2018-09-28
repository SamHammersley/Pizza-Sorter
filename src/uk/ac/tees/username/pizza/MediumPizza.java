package uk.ac.tees.username.pizza;

public class MediumPizza extends Pizza {

	public static final int MEDIUM_SIZE = 12;
	
	private String crust;
	
	public MediumPizza(String topping1, String topping2, String crust) {
		super(MEDIUM_SIZE, topping1, topping2);
		this.crust = crust;
	}

	@Override
	public String toString() {
		return super.toString() + " and a " + crust + " crust";
	}
	
}