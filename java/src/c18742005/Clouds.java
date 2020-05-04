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
        cloudVel = (float)(Math.random()*((1.4f - 1.25f) + 1)) + 1.25f;
        cloudX = (float)(Math.random()*((-200 - 80) + 1)) - 100;
        cloudColour = (float)(Math.random()*((255 - 120) + 1)) + 120;
        cloudSize = (float)(Math.random()*((150 - 120) + 1)) + 120;
        cloudY = (float)(Math.random()*((450 - cloudSize) + 1)) + cloudSize;
    }

    // Constructor
    public Clouds()
    {
        this.cloudVel = (float)(Math.random()*((1.4f - 1.25f) + 1)) + 1.25f;
        this.cloudX = (float)(Math.random()*((-200 - 80) + 1)) - 100;
        this.cloudColour = (float)(Math.random()*((255 - 120) + 1)) + 120;
        this.cloudSize = (float)(Math.random()*((100 - 80) + 1)) + 80;
        this.cloudY = (float)(Math.random()*((450 - cloudSize) + 1)) + cloudSize;
        
    }

    // method to render the clouds to the screen
    public void render(PApplet pa)
    {
        pa.fill(167, 59, cloudColour, 225);

        pa.ellipse(cloudX + cloudSize / 4, cloudY + cloudSize / 4, cloudSize * 0.75f, cloudSize * 0.75f);
        pa.ellipse(cloudX + cloudSize * 0.75f, cloudY + cloudSize / 4, cloudSize * 0.75f, cloudSize * 0.75f);
        pa.ellipse(cloudX, cloudY + cloudSize / 4, cloudSize / 2, cloudSize / 2);
        pa.ellipse(cloudX + cloudSize, cloudY + cloudSize / 4, cloudSize / 2, cloudSize / 2);
        pa.ellipse(cloudX + cloudSize / 4, cloudY, cloudSize / 2, cloudSize / 2);
        pa.ellipse(cloudX + (cloudSize * 0.75f), cloudY, cloudSize / 2, cloudSize / 2);
        pa.ellipse(cloudX + cloudSize / 2, cloudY - (cloudSize / 5), cloudSize / 2, cloudSize / 2);
        
        moveCloud();
    }
}