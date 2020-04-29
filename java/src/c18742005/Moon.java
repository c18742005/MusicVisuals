package c18742005;

import processing.core.PApplet;
import java.lang.Math;

public class Moon
{
    private float xPos = -100;
    private float yPos = 400;
    private float velX = 0.6f;
    private float velY = -0.8f;
    private float gravity = 0.001f;

    public void setXPos(float x)
    {
        this.xPos = x;
    }

    public void setYPos(float y)
    {
        this.yPos = y;
    }

    public void setVelX(float x)
    {
        this.velX = x;
    }

    public void setVelY(float y)
    {
        this.velY = y;
    }

    public void setGrav(float g)
    {
        this.gravity = g;
    }

    public void moveMoon(PApplet pa)
    {
        velY += gravity;
        yPos += velY;
        xPos += velX;
    }

    public float getRandomNum(float min, float max)
    {
        float num = (float)(Math.random()*((max - min) + 1)) + min;

        return num;
    }

    public Moon()
    {
        this.xPos = -100;
        this.yPos = 400;
        this.velX = 0.6f;
        this.velY = -0.8f;
        this.gravity = 0.001f;
    }

    public void render(PApplet pa)
    {
        moveMoon(pa);
        pa.fill(255);
        pa.ellipse(xPos, yPos, 80, 80);

        for (int i = 0; i < 35; i++)
            {
                pa.ellipse(getRandomNum(0, pa.width), getRandomNum(-pa.height, pa.height / 2), 4, 4);
            }
    }
}