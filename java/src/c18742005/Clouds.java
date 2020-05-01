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

    // Accessor methods
    public float getCloudVel()
    {
        return cloudVel;
    }

    public float getCloudX()
    {
        return cloudX;
    }

    public float getCloudY()
    {
        return cloudY;
    }

    public float getCloudSize()
    {
        return cloudSize;
    }

    public float getCloudColour()
    {
        return cloudColour;
    }

    public void setCloudVel(float cV)
    {
        cloudVel = cV;
    }

    public void setCloudX(float cX)
    {
        cloudX = cX;
    }

    public void setCloudY(float cY)
    {
        cloudY = cY;
    }

    public void setCloudSize(float cS)
    {
        cloudSize = cS;
    }

    public void setCloudColour(float cC)
    {
        cloudColour = cC;
    }

    // Methods that can be used on Clouds
    // move cloud across the X axis
    private void moveCloud()
    {
        cloudX += cloudVel;
    }

    // reset cloud to starting position
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

    // method to render the clouds to the screen
    public void render(PApplet pa)
    {
        pa.fill(167, 59, cloudColour, 200);

        pa.ellipse(cloudX + 20, cloudY, cloudSize, cloudSize);
        pa.ellipse(cloudX + 35, cloudY, cloudSize + 10, cloudSize + 10);
        pa.ellipse(cloudX + 60, cloudY - 20, cloudSize + 20, cloudSize + 20);
        pa.ellipse(cloudX + 60, cloudY + 10, cloudSize - 5, cloudSize -5);
        pa.ellipse(cloudX + 90, cloudY, cloudSize + 10, cloudSize + 10);
        moveCloud();
    }
}