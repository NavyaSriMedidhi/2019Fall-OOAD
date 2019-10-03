package edu.fitchburgstate.csc7400.hw1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 1
 * 
 * Date: 2018-09-16
 */

/**
 * Inventory gives the information of the stock of the guitars available in the
 * store.
 * 
 * @author HeadFirstOODA
 *
 */
public class Inventory {
	/**
	 * The list of guitars
	 */
	private List<Guitar> guitars;

	/**
	 * Full constructor Creates an empty guitar list
	 */
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	/**
	 * Adds new guitars to the stock list.
	 * @param serialNumber manufacturer serial number 
	 * @param price guitar price
	 * @param builder the guitar's manufacturer
	 * @param model  the manufacturers model
	 * @param type  guitar type 
	 * @param backWood the wood used for the guitar body
	 * @param topWood  the wood used for the guitar's face
	 */
	public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
		guitars.add(guitar);
	}

	/**
	 * Returns the guitar based on serial number
	 * @param serialNumber manufacturer serial number
	 * @return guitar if serialNumber match with list of available stock
     * @return null if serialNumber was not found
	 */
	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	/**
	 * Searches for guitar
	 * @param searchGuitar a guitar that user wants to find based on Manufacturer, Model,
	 * Type, BackWood, TopWood.
	 * @return guitar if match found
	 */
	public Guitar search(Guitar searchGuitar) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			// Ignore serial number since that's unique
			// Ignore price since that's unique
			String builder = searchGuitar.getManufacturer();
			if ((builder != null) && (!builder.equals("")) && (!builder.equalsIgnoreCase(guitar.getManufacturer())))
				continue;
			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(guitar.getModel())))
				continue;
			String type = searchGuitar.getType();
			if ((type != null) && (!searchGuitar.equals("")) && (!type.equalsIgnoreCase(guitar.getType())))
				continue;
			String backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals("")) && (!backWood.equalsIgnoreCase(guitar.getBackWood())))
				continue;
			String topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals("")) && (!topWood.equalsIgnoreCase(guitar.getTopWood())))
				continue;
			return guitar;
		}
		return null;
	}
}
