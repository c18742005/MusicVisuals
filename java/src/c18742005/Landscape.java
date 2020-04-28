package c18742005;

import processing.core.PApplet;
import processing.core.PImage;

public class Landscape extends PApplet
{
    PImage ship;
    
    int cols, rows;
    int scl = 20;
    int w = 1000;
    int h = 800;

    float flying = 0;

    float[][] terrain;

    public void setup() 
    {
        cols = w / scl;
        rows = h/ scl;
        terrain = new float[cols][rows];
    }

    public void settings()
    {
        size(600, 600, P3D);
    }

    public void keyPressed()
    {
    
    }

    public void waterColour(int x, int y)
    {
        if(terrain[x][y] > 15)
        {
            fill(255); // white
        }
        else if(terrain[x][y] > 12 && terrain[x][y] < 15)
        {
            fill(179, 217, 255);
        }
        else if(terrain[x][y] > 7 && terrain[x][y] < 12)
        {
            fill(128, 191, 255); // light blue
        }
        else if(terrain[x][y] <-10 && terrain[x][y] > -15)
        {
            fill(0, 77, 153);
        }
        else if(terrain[x][y] < -15)
        {
            fill(0, 31, 77); // dark blue
        }
        else
        {
            fill(0, 102, 204); // Blue
        }
    }

    public void draw() {
        flying -= 0.02;

        float yoff = flying;
        for (int y = 0; y < rows; y++) 
        {
            float xoff = 0;
            for (int x = 0; x < cols; x++)
            {
                terrain[x][y] = map(noise(xoff, yoff), 0, 1, -25, 25);
                xoff += 0.2;
            }
            yoff += 0.2;
        }

        background(153, 187, 255);
        noStroke();
        fill(0, 0, 255);

        translate(width/2, height/2+50);
        rotateX(PI/3);
        translate(-w/2, -h/2);

        for (int y = 0; y < rows-1; y++) 
        {
            beginShape(TRIANGLE_STRIP);
            for (int x = 0; x < cols; x++) 
            {
                waterColour(x, y);
                
                vertex(x*scl, y*scl, terrain[x][y]);
                vertex(x*scl, (y+1)*scl, terrain[x][y+1]);
            }
            endShape();
        }
    }
} 