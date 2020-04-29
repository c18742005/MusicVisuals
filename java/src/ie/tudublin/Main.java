package ie.tudublin;

import example.CubeVisual;
import example.MyVisual;
import c18742005.Landscape;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CubeVisual());		
	}

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