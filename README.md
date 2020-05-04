# Music Visualiser Project

Name: Steven Aherne

Student Number: C18742005

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment
This assignment is a visual art piece inspired by the song "If I had a Heart" by Fever Ray. The music piece is the introductory song for the TV show Vikings and is very slow tempoed and eery. When listening to the song I came up with the idea of a viking boat being caught in a storm and becoming lost at sea. The visual piece focuses on following a survivor for days on end with no sign of land and the days and nights slowly melding together. The sun and the moon are constantly whizzing by simulating the passage of time while they both react to the amplitude of the music constantly beating down on the survivor. When night arrives, the clear sea sky and lack of lights come into play and the sky lights up with stars twinkling. The clouds act as a constant reminder of the storm that has just passed with some of them being light and small while others are huge and menacing constantly threatening to start a new storm. Once the song finishes the sun and moon are still and no longer reactive to music signalling the survivors thoughts drifting away.

# Instructions
As this is a visual art piece the user does not need much to control the assignment.

1. Open the MusicVisuals folder in Visual Studio Code
2. Navigate to java/src/c18742005/Main.java and click to open the file
3. Click the "F5" button OR click "Run" above the main method to start the visual piece
4. Optional: If you wish to change from day to night or vice versa at any stage just press the SPACEBAR to start the alternate cycle
5. Once the music finishes the user can end the art piece by pressing the "ESC" key

# How it works

# What I am most proud of in the assignment

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

