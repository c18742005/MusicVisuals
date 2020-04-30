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

    // method to reset the sun to its starting position
    public void resetSun()
    {
        xPos = -100;
        yPos = 400;
        velX = 0.6f;
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
        this.yPos = 400;
        this.velX = 0.6f;
        this.velY = -0.8f;
        this.gravity = 0.001f;
    }

    // method to render the sun to the screen
    public void render(PApplet pa)
    {
        moveSun();
        pa.fill(43, 171, 255);
        pa.ellipse(xPos, yPos, 80, 80);
    }
}