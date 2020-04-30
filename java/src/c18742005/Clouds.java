package c18742005;

import processing.core.PApplet;
import java.lang.Math;

public class Clouds
{
    // variable to control cloud across the screen
    private float cloudVel;
    private float cloudX;
    private float cloudY;
    private float cloudSize;
    private float cloudColour;

    private void moveCloud()
    {
        cloudX += cloudVel;
    }

    public void resetCloud()
    {
        cloudX = -100;
        cloudY = (float)(Math.random()*((350 - 0) + 1)) + 0;
        cloudColour = (float)(Math.random()*((255 - 120) + 1)) + 120;
        cloudSize = (float)(Math.random()*((80 - 40) + 1)) + 40;
    }

    // Constructor
    public Clouds()
    {
        this.cloudVel = 0.5f;
        this.cloudX = -100;
    }

    // method to render the sun to the screen
    public void render(PApplet pa)
    {
        pa.fill(167, 59, cloudColour);

        pa.ellipse(cloudX + 20, cloudY, cloudSize, cloudSize);
        pa.ellipse(cloudX + 35, cloudY, cloudSize + 10, cloudSize + 10);
        pa.ellipse(cloudX + 60, cloudY - 20, cloudSize + 20, cloudSize + 20);
        pa.ellipse(cloudX + 60, cloudY + 10, cloudSize - 5, cloudSize -5);
        pa.ellipse(cloudX + 90, cloudY, cloudSize + 10, cloudSize + 10);
        moveCloud();
    }
}