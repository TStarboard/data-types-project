/**
 * File Name: DataTypesApp.java<br>
 * Wong, Tony<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: May 1, 2017
 */
package com.sqa.tw;

import com.sqa.tw.helpers.*;

public class DataTypesApp {

	public static void main(String[] args) {
		String name = AppBasics.greetUser("DataTypesApp");
		getString();
		getChar();
		getFloat();
		getShort();
		getLong();
		getBoolean();
		AppBasics.farewellUser(name);
	}

	private static void getBoolean() {
		boolean booleanVar = AppBasics.requestBoolean("Please enter a boolean data type");
	}

	private static void getChar() {
		// Write a method to collect data type = Char
		char character = AppBasics.requestChar("Please enter a character data type");
	}

	private static void getFloat() {
		// Write a method to collect data type = Float
		float floatVar = AppBasics.requestFloat("Please enter a float data type");
	}

	private static void getLong() {
		// Write a method to collect data type = Long
		long longVar = AppBasics.requestLong("Please enter a long data type");
	}

	private static void getShort() {
		// Write a method to collect data type = Short
		String question = "How many kids do you have?";
		short shortVar = AppBasics.requestShort("Please enter a short data type");
		System.out.println("I have " + shortVar + " of kids!");
	}

	private static void getString() {
		// Write a method to collect data type = String
		String sentence = AppBasics.requestString("Please enter a string data type");
	}
}
