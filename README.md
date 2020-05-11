# Music Visualiser Project

Name: Steven Aherne

Student Number: C18742005

# Description of the assignment
This assignment is a visual art piece inspired by the song "If I had a Heart" by Fever Ray. The music piece is the introductory song for the TV show Vikings and is very slow tempoed and eery. When listening to the song I came up with the idea of a viking boat being caught in a storm and becoming lost at sea. The visual piece focuses on following a survivor for days on end with no sign of land and the days and nights slowly melding together. The only sign of life is a small bird that is always flying by and circling the survivor. This bird is controlled by the user of the program. The sun and the moon are constantly whizzing by simulating the passage of time while they both react to the amplitude of the music constantly beating down on the survivor. When night arrives, the clear sea sky and lack of lights come into play and the sky lights up with stars twinkling. The clouds act as a constant reminder of the storm that has just passed with some of them being light and small while others are huge and menacing constantly threatening to start a new storm. Once the song finishes the sun and moon are still and no longer reactive to music signalling the survivors thoughts drifting away.

# Youtube Link
The link to my YouTube video Demonstrating the assignment can be found here: [![YouTube](https://img.youtube.com/vi/EysTWhdf-is/1.jpg)](https://youtu.be/EysTWhdf-is)

# Instructions
- Once the program has started press the SPACEBAR at any time to begin the music.
- The mouse is used to control the bird on the screen. Hover your mouse across the sky to make the bird fly.
- If you place your mouse in the water the bird will land on the water and float there.
- If it is day time you can press the ENTER key at any point to switch to night and vice versa. 
- Pressing the ESC key will close the project.


# How it works
1. Open the MusicVisuals folder in Visual Studio Code
2. Navigate to java/src/c18742005/Main.java and click to open the file
3. Click the "F5" button OR click "Run" above the main method to start the visual piece
4. Once the music finishes the user can end the visual piece by pressing the "ESC" key

# What I am most proud of in the assignment
Here is a list of things I am most proud of in the assignment and below is a small description of why I am proud of each thing:
- The simulation of water flowing
- Getting the Sky colour to react to the passage of time
- The random generation of Cloud colour, size, position and velocity
- The Sun and Moon objects rising and setting in the sky and the random generation of stars
- A user controlled, moving Bird object oon screen

#### Simulation of water flowing
The element of the assignment that I am most proud of is the generation of the sea water and the simulation of the water flow. This required a lot of self directed learning and much trial and error with the code before I could implement it to a satisfactory level. Using the noise() function instead of random() when creating the wave height allowed for a much more natural looking wave generation. The water feature also involved a lot of translation and rotation along with the use of vertices to get it to work correctly.

#### Sky Colour Reacting to Passage of Time
Getting the sky to react to the passage of time and change colour was also an achievement for me. The brightest time of the day is when time is at 0. As long as it is day time, the sky will keep getting darker until it is almost black and night begins. When it is night the opposite happens and the sky will get brighter until it is day again.

#### Randomisation of Cloud Colour, Size, Velocity and Position
The random generation of each clouds colour, size and position in the sky is also something that I am proud of. Once the day cycle finishes the clouds drawn to the screen are reset giving them new randomly generated colour, size, speed and positional values meaning the clouds will be different for each cycle of the art piece.

#### Rising and Setting Sun and Moon Objects
The sun and moon bodies are something that I put a lot of work into and I am proud of the way they came out. They each have their own velocities across the X and Y axis and also have the force of gravity working on them to simulate them setting in the sky. The moon class also draws 35 stars to the screen in randomised positions to light the sky up and help simulate the passage of time.

#### User Controlled Bird Object
Finally, the Bird object is a huge achievement for me as I completed a great amount of self learning to enable the drawing of a moving object to screen. Writing the class made me think about the colour the bird was going to be during the day and night and how I was going to change this. I also put a great deal of thought into how I was going to get the bird to fly from right to left then transition to fly from left to right. Figuring out how to continue drawing the bird once the user stopped moving the mouse or moved away from the sky required the use of method overriding to implement.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

