/* * Class: Object-Oriented Analysis and Design 
 * * Professor: Orlando Montalvo 
 * * Assignment: HW 1 * 
 * Date: 2019-01-01 
 * * Authors: Orlando Montalvo (omontalv) 
 * Student: Vinitha Gaddampally
*/

package edu.fitchburgstate.csc7400.hw1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GuitarTest {
 Guitar GuitarTest;



	@Before

public void setUp() throws Exception {

this.GuitarTest = new Guitar("ch2398" ,
// serial Number 389.19 , 
//store price  "Harman",
//Manufacturer "LiteString",
// manufacturer Model  "electric ",
// type of Guitar    "RoughCore", 
//Back wood   "Androif"
// Face wood);

}

@Test

public void test() {

fail("Not yet implemented");

public void testGetSerialNumber() {

    String Entered ="ch2398";
 String returned = this.GuitarTest.getSerialNumber();
assertEquals(Entered, returned, String.format("SerialNumber %s != %s", Entered, returned));

}


 @Test

 public  void testGetPrice() {

 double expected =389.19;

  double returned = this.GuitarTest.getPrice();

assertEquals(expected, returned, 0.01, String.format("Price %f != %f",expected, returned));

}

 @Test

void testSetPrice() {

  double expected = 389.19;

  this.GuitarTest.setPrice(expected);

 double returned = this.GuitarTest.getPrice();

  assertEquals(expected, returned, String.format("PRice %f != %f", expected,returned));

}

@Test
 void testGetManufacturer() {

  String expected = " Harman";

 String returned = this.GuitarTest.getManufacturer();

assertEquals(expected, returned, String.format("Manufacturer %s != %s", expected, returned));

 }
  @Test
 void testGetType() {

  String entered="LiteString";

  String returned=this.GuitarTest.getType();

 assertEquals(entered,returned,String.format("Type %s != %s", entered,returned));

}

@Test
void TestBackWood() {

  String entered="RoughCore";

 String returned =this.GuitarTest.getBackWood();

  assertEquals(entered, returned, String.format("Back Wood %s != %s", entered,returned));

 }

 @Test

 void TestGetTopWood() {

  String entered ="Androif";

 String returned =this.GuitarTest.getTopWood();

 assertEquals(entered,returned, String.format("Top Wood %s != %s", entered, returned));

 }

}

	