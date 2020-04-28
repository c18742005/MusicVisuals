package c18742005;

import processing.core.PApplet;

public class Sky
{
    private float time;

    public float getTime()
    {
        return time;
    }

    public void setTime(float time)
    {
        this.time = time;
    }

    public Sky()
    {
        this.time = 0;
    }

    public void renderSky(PApplet pa)
    {
        time = time % 24;

        if(time < 12)
        {
            pa.background(135 , 94 ,227 - time * 18);
            time += 0.01;
        }
        else
        {
            pa.background(135, 94, 11 + (time % 12) * 18);
            time += 0.01;
        }
    }
}