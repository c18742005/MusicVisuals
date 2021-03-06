package c18742005;

import ie.tudublin.Visual;

public class Landscape extends Visual
{
    // Create the sky, moon and sun objects
    Sky sky = new Sky();
    Sun sun = new Sun();
    Moon moon = new Moon();
    Bird bird = new Bird();
    Clouds clouds[] = new Clouds[3];

    // Create variables to control the generation of the water
    int cols, rows;
    int waveDensity = 15;
    int w = 2700;
    int h = 800;

    // Create variables to control the flow of the water
    float waterFlow = 0;
    float[][] waves;

    public void setup() 
    {
        startMinim();

        // setup variables to be used in project
        cols = w / waveDensity;
        rows = h/ waveDensity;
        waves = new float[cols][rows];
        for(int i = 0; i < 3; i++)
        {
            Clouds cloud = new Clouds();
            clouds[i] = cloud;
        }

        // load the audio to be played
        loadAudio("viking.mp3");
    }

    public void settings()
    {
        fullScreen(P3D, SPAN);
    }

    // method to control what happens when certain keys are pressed
    public void keyPressed()
    {
        // if enter key is pressed change from day to night or vice versa
        if(key == '\n')
        {
            if(sky.getTime() > 5 && sky.getTime() < 18)
            {
                sky.setTime(18);
            }
            else
            {
                sky.setTime(5);
            }
        }

        // if space key is pressed begin the music
        if(key == ' ')
        {
            getAudioPlayer().play();
        }
    }

    // method to render the water to the screen
    public void renderWater()
    {
        waterFlow += 0.02; // make the water flow towards the user

        // loops to create the water at each point and place it into the waves 2D array
        float offsetY = waterFlow;

        for (int y = 0; y < rows; y++) 
        {
            float offsetX = 0;

            for (int x = 0; x < cols; x++)
            {
                // map a value from 0 to 1 to -25 to 25 where -25 is deep water and 25 is the tip of a wave
                // noise gives us a number between 0 to 1 and ensures more natural looking water generation
                waves[x][y] = map(noise(offsetX, offsetY), 0, 1, -25, 25);
                offsetX += 0.2;
            }

            offsetY += 0.2;
        }

        noStroke();
        fill(0, 0, 255);

        // translate and rotate the X axis to make it appear the water is coming at the user
        pushMatrix();
        translate(width / 2, (height / 2) + 200);
        rotateX(PI / 3);
        translate(-w / 2, (-h / 2));

        // loop to actually draw the water to the screen
        for (int y = 0; y < rows-1; y++) 
        {
            // begin drawing our triangle strip shape
            beginShape(TRIANGLE_STRIP);
            for (int x = 0; x < cols; x++) 
            {
                // colour the water based on its depth
                waterColour(x, y);
                
                // get 3d position of our vertices and draw them to screen
                vertex(x * waveDensity, y * waveDensity, waves[x][y]);
                vertex(x * waveDensity, (y + 1) * waveDensity, waves[x][y+1]);
            }
            endShape(); // end of drawing our shape
        }
        popMatrix();
    }

    // method to control the colour of the water
    public void waterColour(int x, int y)
    {
        colorMode(RGB);

        // make the tip of the waves white
        if(waves[x][y] > 15)
        {
            fill(255);
        }
        else if(waves[x][y] > 12 && waves[x][y] < 15) // make higher sections of water a lighter blue
        {
            fill(179, 217, 255);
        }
        else if(waves[x][y] > 7 && waves[x][y] < 12)
        {
            fill(128, 191, 255); // light blue
        }
        else if(waves[x][y] <-8 && waves[x][y] > -15) // make deeper sections of water a darker blue
        {
            fill(0, 77, 153);
        }
        else if(waves[x][y] < -15) // make deepest parts of water almost black
        {
            fill(0, 31, 77);
        }
        else
        {
            fill(0, 102, 204); // Make normal leveled water blue
        }
    }

    // method to draw the bird to the screen
    public void drawBird()
    {
        // if bird is in the sky draw the bird to screen
        if(mouseX < width && mouseY < 500)
        {
            bird.render(this, mouseX, mouseY, sky.getTime());
        }
        else if(mouseY > 500) // if mouse Y position is in the water then draw bird resting on the water
        {
            bird.render(this, mouseX, sky.getTime());
        }
    }

    // Method to draw the sun or moon to the screen depending on the time of day
    public void drawCelestial()
    {
        // during the night render the moon and reset the sun and clouds 
        if(sky.getTime() > 5 && sky.getTime() < 18)
        {
            moon.render(this, getSmoothedAmplitude());
            sun.resetSun();

            // Loop to reset the clouds to their starting position
            for(int i = 0; i < 3; i++)
            {
                clouds[i].resetCloud();
            }
        }
        else // during the day render the sun and reset the moon to its starting position
        {
            sun.render(this, getSmoothedAmplitude());

            // Loop to render the clouds to the screen
            for(int i = 0; i < 3; i++)
            {
                clouds[i].render(this);
            }

            moon.resetMoon();
        }
    }

    // method to draw objects to the screen
    public void draw() 
    {
        calculateAverageAmplitude();
        colorMode(HSB);

        sky.renderSky(this);    // render the sky
        drawCelestial();        // render the sun or moon
        drawBird();             // render the bird to the screen
        renderWater();          // render the water to the screen
    }
} 