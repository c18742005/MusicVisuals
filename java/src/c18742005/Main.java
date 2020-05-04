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