package c18742005;

import processing.core.PApplet;

public class Bird
{
    private float birdX;
    private float birdY;

    // Constructor
    public Bird()
    {
        this.birdX = 100;
        this.birdY = 200;
    }

    // render the bird to the screen
    public void render(PApplet pa, float x, float y, float time)
    {   
        // make bird white in the day or darker at night
        if(time > 5 && time < 18)
        {
            pa.fill(180);
        }
        else 
        {
            pa.fill(255);
        }

        if(pa.mouseX >= birdX)
        {
            birdX = x;
            birdY = y;

            pa.ellipse(x - 30, y - 0.5f, 40, 40);  // head
            pa.triangle(x - 110, y + 19.5f , x - 140, y + 19.5f, x - 140, y + 44.5f); // tail
            pa.arc(x - 70, y + 19.5f, 80, 80, 0, PApplet.PI, PApplet.OPEN); // body

            pa.stroke(0);
            pa.arc(x - 90, y + 29.5f, 50, 50, 0, PApplet.PI, PApplet.CHORD); // wing

            pa.fill(25, 255, 255);
            pa.triangle(x - 12, y - 8, x - 12, y + 7, x, y); // beak

            pa.fill(0);
            pa.ellipse(x - 25, y - 5.5f, 5, 5); // eye

            pa.noStroke();
        }
        else
        {
            birdX = x + 1;
            birdY = y;

            pa.ellipse(pa.mouseX + 30, y - 0.5f, 40, 40);  // head
            pa.triangle(pa.mouseX + 110, y + 19.5f , pa.mouseX + 140, y + 19.5f, pa.mouseX + 140, y + 44.5f); // tail
            pa.arc(pa.mouseX + 70, y + 19.5f, 80, 80, 0, PApplet.PI, PApplet.OPEN); // body

            pa.stroke(0);
            pa.arc(pa.mouseX + 90, y + 29.5f, 50, 50, 0, PApplet.PI, PApplet.CHORD); // wing

            pa.fill(25, 255, 255);
            pa.triangle(pa.mouseX + 12, y - 8, pa.mouseX + 12, y + 7, pa.mouseX, y); // beak

            pa.fill(0);
            pa.ellipse(pa.mouseX + 25, y + 5.5f, 5, 5); // eye

            pa.noStroke();
        }
    }

    public void render(PApplet pa, float x, float time)
    {
        // make bird white in the day or darker at night
        if(time > 5 && time < 18)
        {
            pa.fill(180);
        }
        else 
        {
            pa.fill(255);
        }
        
        if(pa.mouseX >= birdX)
        {
            birdX = x;

            pa.ellipse(birdX - 30, birdY - 0.5f, 40, 40);  // head
            pa.triangle(birdX - 110, birdY + 19.5f , birdX - 140, birdY + 19.5f, birdX - 140, birdY + 44.5f); // tail
            pa.arc(birdX - 70, birdY + 19.5f, 80, 80, 0, PApplet.PI, PApplet.OPEN); // body

            pa.stroke(0);
            pa.arc(birdX - 90, birdY + 29.5f, 50, 50, 0, PApplet.PI, PApplet.CHORD); // wing

            pa.fill(25, 255, 255);
            pa.triangle(birdX - 12, birdY -8, birdX -12, birdY + 7, birdX, birdY); // beak

            pa.fill(0);
            pa.ellipse(birdX - 25, birdY - 5.5f, 5, 5); // eye

            pa.noStroke();
        }
        else
        {
            birdX = x + 1;

            pa.ellipse(birdX + 30, birdY - 0.5f, 40, 40);  // head
            pa.triangle(birdX + 110, birdY + 19.5f , birdX + 140, birdY + 19.5f, birdX + 140, birdY + 44.5f); // tail
            pa.arc(birdX + 70, birdY + 19.5f, 80, 80, 0, PApplet.PI, PApplet.OPEN); // body

            pa.stroke(0);
            pa.arc(birdX + 90, birdY + 29.5f, 50, 50, 0, PApplet.PI, PApplet.CHORD); // wing

            pa.fill(25, 255, 255);
            pa.triangle(birdX + 12, birdY -8, birdX + 12, birdY + 7, birdX, birdY); // beak

            pa.fill(0);
            pa.ellipse(birdX + 25, birdY - 5.5f, 5, 5); // eye

            pa.noStroke();
        }

    }
}