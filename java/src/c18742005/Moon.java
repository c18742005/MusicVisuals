package c18742005;

import processing.core.PApplet;
import java.lang.Math;

public class Moon
{
    // create variables to control the movement of the moon in the sky
    // X and Y positions of the moon in the sky
    private float xPos;
    private float yPos;

    // X and Y velocity of the moons movement 
    private float velX;
    private float velY;

    // gravity effect
    private float gravity;

    // method to reset the moon to its starting position
    public void resetMoon()
    {
        xPos = -100;
        yPos = 390;
        velX = 0.7f;
        velY = -0.8f;
        gravity = 0.001f;
    }

    // method to move the moon in the sky
    private void moveMoon()
    {
        velY += gravity;
        yPos += velY;
        xPos += velX;
    }

    // method that takes a range of numbers and returns a random number from them
    public float getRandomNum(float min, float max)
    {
        float num = (float)(Math.random()*((max - min) + 1)) + min;

        return num;
    }

    // Constructor
    public Moon()
    {
        this.xPos = -100;
        this.yPos = 390;
        this.velX = 0.7f;
        this.velY = -0.8f;
        this.gravity = 0.001f;
    }

    // render the moon and stars to the screen
    public void render(PApplet pa, float amp)
    {
        float moonSize = 65 + (amp * 300);
        moveMoon();
        pa.fill(255);
        pa.ellipse(xPos, yPos, moonSize, moonSize);
        pa.fill(225);
        pa.ellipse(xPos - 25, yPos + 15, 20, 20);
        pa.ellipse(xPos - 15, yPos + 30, 10, 10);
        pa.fill(200);
        pa.ellipse(xPos + 20, yPos - 20, 7, 7);

        // loop to draw randomised stars to the screen
        for (int i = 0; i < 35; i++)
        {
            pa.ellipse(getRandomNum(0, pa.width), getRandomNum(-pa.height, pa.height / 2), 4, 4);
        }
    }
}