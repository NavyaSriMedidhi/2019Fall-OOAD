
/*
 * class:Object Oriented Analysis and Design
 * Instructor:Orlando Montalvo
 * Assignment:1
 * Student Name:Akhila Lolam (@01408514)
 */

package edu.fitchburgstate.csc7400.hw1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
* InventoryTest class contains JUnit test cases for Inventory class.
* Presently it matches customer requirements with the available inventory
* The aim of the inventory test class is to test all methods present in inventory class
*
*/

class InventoryTest {
	Inventory inventory;

	@BeforeEach // method which executes before the @Test
	void setUp() throws Exception {
		inventory = new Inventory(); // First we are declaring inventory.
		//we add all the guitar details to the inventory
		inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic", "Indian Rosewood", "Sitka");
		inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric", "Alder", "Alder");
		inventory.addGuitar("V9512", 1549.95, "Fender", "Stratocastor", "electric", "Alder", "Alder");
		inventory.addGuitar("122784", 5495.95, "Martin", "D-18", "acoustic", "Mahogany", "Adirondack");
		inventory.addGuitar("76531", 6295.95, "Martin", "OM-28", "acoustic", "Brazilian Rosewood", "Adriondack");
		inventory.addGuitar("70108276", 2295.95, "Gibson", "Les Paul", "electric", "Mahogany", "Maple");
		inventory.addGuitar("82765501", 1890.95, "Gibson", "SG '61 Reissue", "electric", "Mahogany", "Mahogany");
		inventory.addGuitar("77023", 6275.95, "Martin", "D-28", "acoustic", "Brazilian Rosewood", "Adirondack");
		inventory.addGuitar("1092", 12995.95, "Olson", "SJ", "acoustic", "Indian Rosewood", "Cedar");
		inventory.addGuitar("566-62", 8999.95, "Ryan", "Cathedral", "acoustic", "Cocobolo", "Cedar");
		inventory.addGuitar("6 29584", 2100.95, "PRS", "Dave Navarro Signature", "electric", "Mahogany", "Maple");
	}
	

	 // Executes before every test method and makes inventory NULL
	
	@AfterEach //executes before the @Test
	void tearDown() throws Exception {
		inventory = null;
	}
	
	/**
	* testSearch method will test the inventory by passing guitar with all the arguments.
	* fail if no match is found and pass if match is found
	*/

	@Test
	void testSearch() {
		Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder"); //taking input from the user of his own choice.
		Guitar guitar = inventory.search(whatErinLikes);//Searching for the required guitar from the inventory 
		if (guitar != null) { //checking if the results are fetched by the inventory if details are found then display the message,model,type and price of the particular guitar
			System.out.println("Erin, you might like this " + guitar.getManufacturer() + " " + guitar.getModel() + " "
					+ guitar.getType() + " guitar:\n   " + guitar.getBackWood() + " back and sides,\n   "
					+ guitar.getTopWood() + " top.\nYou can have it for only $" + guitar.getPrice() + "!");
		} else {
			System.out.println("Sorry, Erin, we have nothing for you."); //if no details are fetched from the inventory then display the message that we have nothing for you 
			fail("Did not find guitar");
		}
	}

}
