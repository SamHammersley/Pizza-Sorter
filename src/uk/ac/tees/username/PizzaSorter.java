/** A class to sort pizzas by their radius.
 *
 * Based on work created by Mark Truran.
 * September 2018
 * AJP class
 */

package uk.ac.tees.username;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.stream.Collectors;

import uk.ac.tees.username.pizza.Pizza;

public class PizzaSorter {

	/**
	 * This method parses the named data file and creates pizza objects.
	 *
	 * @param file
	 *            the file containing the data
	 * @return an array list of pizza objects
	 */
	public ArrayList<Pizza> parseFile(File file) {
		try {
			ArrayList<Pizza> l = Files.lines(file.toPath()).map(Pizza::parse).collect(Collectors.toCollection(ArrayList::new));
			
			return l.contains(null) ? null : l; 
		} catch(IOException e) {
			return null;
		}
	}

	/**
	 * This method returns a list of all the pizzas in the named data file.
	 *
	 * @param fileName
	 *            The name of the file containing the data
	 * @return A list of pizzas
	 */
	public String listAllPizzas(final String fileName) {
		return parseFile(new File(fileName)).stream().map(Pizza::toString).collect(Collectors.joining("\n"));
	}

	/**
	 * This method returns a list of all the pizzas of a given size.
	 *
	 * @param fileName
	 *            The name of the file containing the data
	 * @param radius
	 *            the radius of the pizza
	 * @return A list of pizzas
	 */
	public String filterPizzas(final String fileName, int radius) {
		return parseFile(new File(fileName)).stream().filter(p -> p.getRadius() == radius).map(Pizza::toString).collect(Collectors.joining("\n"));
	}
}