package edu.fitchburgstate.csc7400.hw1;
/**
* Class: Object-Oriented Design and Analysis
* Professor: Orlando Montalvo
 * Assignment: HW 1
 * Student: Vinitha Gaddampally
 * Date: 2019-09-20
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 * * Inventory  class contains available guitars from Ricks music store
 * @author HeadFirstOODA
 *
 */
public class Inventory {
	/**
  *  Rick's guitar inventory list
   */
  private List<Guitar> guitars;
  /**
  * Constructor
  *
  * Initializes guitar inventory list
  */
  public Inventory() {
    guitars = new LinkedList<Guitar>();
  }
       /**
		 * This particular method adds guitar to the inventory
		 * @param serial Number
		 * @param price store
		 * @param builder
		 * @param model
		 * @param type guitar type
		 * @param backwood
		 * @param@topwood
		 */
   public void addGuitar(String serialNumber,double price, String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
   /**
    * returns a guitar to the specified serial number
    * @param serialNumber
    * @return
    */
  public Guitar getGuitar(String serialNumber) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  /**
   * returns a guitar from the Inventory based on the guitar specification
   * @param searchGuitar
   * @return
   */
public Guitar search(Guitar searchGuitar) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getManufacturer();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getManufacturer())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))
        continue;
      return guitar;
    }
    return null;
  }
}
