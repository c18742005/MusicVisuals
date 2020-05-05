/*
    Class to control the Sky
    Controls the colour of the sky at each given time 
*/

package c18742005;

import processing.core.PApplet;

public class Sky
{
    // Variable to control time in the program
    private float time;

    // accessor method to get the time
    public float getTime()
    {
        return time;
    }

    // accessor method to set the time
    public void setTime(float time)
    {
        this.time = time;
    }

    // Constructor
    public Sky()
    {
        this.time = 18;
    }

    // method to render the sky to the applet
    public void renderSky(PApplet pa)
    {
        // reset time to 0 if end of day is hit
        time = time % 24;

        // considered daytime, if the time is below 12 keep making the sky darker
        if(time < 12)
        {
            pa.background(135 , 94 ,227 - time * 18);
            time += 0.006;
        }
        else // night time, keep making the sky brighter
        {
            pa.background(135, 94, 11 + (time % 12) * 18);
            time += 0.006;
        }
    }
}