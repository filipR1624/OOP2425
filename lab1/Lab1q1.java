// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 19th September
// Purpose 			: My first class implementation

public class Lab1q1
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );

		// creating a new Thermometer object (initialise it to 10)
		Thermometer thermB = new Thermometer(10);

		// create a variable to hold the value of thermB
		double tempB = thermB.getCelsius();

		// print the contents of tempB
		System.out.println("Temp. of Thermometer B is " + tempB);
		
	} // end main
} // end class ThermTest
