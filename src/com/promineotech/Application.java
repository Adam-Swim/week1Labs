package com.promineotech;

public class Application {

	public static void main(String[] args) {
		int availablePlaneSeats = 8;
		double costOfGroceries = 174.85;
		char middleInitial = 'H';
		boolean isHotOutside = false;
		String firstName = "Adam";
		String streetAddress = "1234 Main St";
		
		System.out.println("Available seats left on the plane:" + " " + availablePlaneSeats); //uses " " to concatenate and add spaces to sentences
		System.out.println("$" + costOfGroceries + " " + "is the cost of this week's groceries");//uses " " to concatenate and add spaces to sentences
		System.out.println("My middle initial is:" + middleInitial);
		System.out.println(isHotOutside + "," + "it is not hot outside" );
		System.out.println(firstName + " is my first name");// uses spaces at the beginning of string to add spaces to sentences
		System.out.println(streetAddress + " is the address of the best pizza place in town");// uses spaces at the beginning of string to add spaces to sentences
        
		availablePlaneSeats -= 2;
		System.out.println("Available seats left on the plane:" + " " + availablePlaneSeats);
		costOfGroceries += 2.15;
		System.out.println("$" + costOfGroceries + " " + "is the cost of this week's groceries");
		
		middleInitial = 'C';
		System.out.println("My middle initial is: " + middleInitial);
		//isHotOutside = true;
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside + "," + " it is hot outside" );
		
	    String fullName = firstName + " " + middleInitial + " Salt";
	    System.out.println(fullName);
	    
	    System.out.println("Hello, my name is " + fullName + "," + " " + "and I live at " + streetAddress);
	    
	}

}
