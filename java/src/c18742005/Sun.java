package c18742005;

import processing.core.PApplet;

public class Sun
{
    // create variables to control the movement of the sun in the sky
    // X and Y positions of the sun in the sky
    private float xPos;
    private float yPos;

    // X and Y velocity of the suns movement 
    private float velX;
    private float velY;

    // gravity effect
    private float gravity;

    // Accessor methods
    public void setXPos(float x)
    {
        xPos = x;
    }

    public void setYPos(float y)
    {
        yPos = y;
    }

    public void setVelX(float x)
    {
        velX = x;
    }

    public void setVelY(float y)
    {
        velY = y;
    }

    public void setGravity(float g)
    {
        gravity = g;
    }

    public void getXPos(float x)
    {
        xPos = x;
    }

    public float getYPos()
    {
        return yPos;
    }

    public float getVelX()
    {
        return velX;
    }

    public float getVelY()
    {
        return velY;
    }

    public float getGravity()
    {
        return gravity;
    }

    // method to reset the sun to its starting position
    public void resetSun()
    {
        xPos = -100;
        yPos = 390;
        velX = 1.25f;
        velY = -0.8f;
        gravity = 0.001f;
    }

    // method to move the sun in the sky
    private void moveSun()
    {
        velY += gravity;
        yPos += velY;
        xPos += velX;
    }

    // Constructor
    public Sun()
    {
        this.xPos = -100;
        this.yPos = 390;
        this.velX = 1.25f;
        this.velY = -0.8f;
        this.gravity = 0.001f;
    }

    // method to render the sun to the screen
    public void render(PApplet pa, float amp)
    {
        float sunSize = 50 + (amp * 300);
        moveSun();
        pa.fill(43, 171, 255, 20);
        pa.ellipse(xPos, yPos, sunSize + 70, sunSize + 70);
        pa.fill(43, 171, 255, 50);
        pa.ellipse(xPos, yPos, sunSize + 20, sunSize + 20);
        pa.fill(43, 171, 255);
        pa.ellipse(xPos, yPos, sunSize, sunSize);
    }
}