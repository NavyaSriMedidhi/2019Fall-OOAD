/*
 * class:Object Oriented Analysis and Design
 * Instructor:Orlando Montalvo
 * Assignment:1
 * Student Name: Akhila Lolam (@01408514)
 */
package edu.fitchburgstate.csc7400.hw1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
* Inventory contains all information about guitars that are available in store which will help the owner to help him match customers of their choice
* and for customers to find suitable guitars.
*
*/

public class Inventory {
  private List<Guitar> guitars;
  
  // Stores list of all guitars that are presently available 
  
  public Inventory() {
   // creating object of linked list
    guitars = new LinkedList<Guitar>();
  }
  
/**
* constructor
* @param serialNumber manufactures serial number
* @param price stores price
* @param builder the guitar builder
* @param model the manufacture model
* @param type guitar type
* @param backWood the wood used for guitar body
* @param topWood the wood used for guitar face
*/

  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  
/**
* getGuitar takes guitar serialNumber
* @return the guitar object
*
*/
  public Guitar getGuitar(String serialNumber) {
    //hasNext returns true if it has more guitar elements to iterate
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
     //it returns the next element of the list
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  /**
   * It would return the name of the manufacturer
   * and store in the string builder
   */
  public Guitar search(Guitar searchGuitar) {
      //hasNext returns true if it has more guitar elements to iterate
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      //it returns the next element of the list
      // if there is no next element in the list it throws exception
      Guitar guitar = (Guitar)i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      /* Returns the name of the manufacturer and stores in the
      * string buffer
      */
      String builder = searchGuitar.getManufacturer();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getManufacturer()))) //Without the case sensitivity it compares  manufacturer name
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))//Without the case sensitivity it compares model
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType())))//Without the case sensitivity it compares the type
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))//Ignoring the case it compares the backwood
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))//Ignoring the case it compares the topwood
        continue;
      return guitar;
    }
    return null;
  }
}

