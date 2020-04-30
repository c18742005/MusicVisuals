package c18742005;

import processing.core.PApplet;
import processing.core.PImage;

public class Ship
{
    private PImage ship1;
    private PImage ship2;
    private PImage ship3;

    private PImage ships[] = {ship1, ship2, ship3};

    // Constructor
    public Ship(PApplet pa)
    {
        this.ship1 = pa.loadImage("ship");
        this.ship2 = pa.loadImage("ship");
        this.ship3 = pa.loadImage("ship");
    }

    // method to render the ship to the screen
    public void render(PApplet pa)
    {
        pa.image(ship1, pa.width / 2, pa.height / 2);
    }
}