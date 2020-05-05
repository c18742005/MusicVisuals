/*
	The driver class of the project
	Run the main method of this class to start the project
	This program was created for the Object Oriented Programming Assignment in Java 

	Created By: Steven Aherne
	Student Number: C18742005
	Program Code: DT228/2
*/


package c18742005;

public class Main
{	
	// method to start playing the module project
	public void startLandscape()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Landscape());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startLandscape();			
	}
}