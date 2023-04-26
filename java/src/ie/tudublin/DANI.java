package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;

public class DANI extends PApplet {

	

	public void settings() {
		size(1000, 1000);
		loadFile();
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void loadFile()
	{
		String[] lines = loadStrings("small.txt"); // Load a text file into a String array
		String words = " ";

		
		for(String line : lines)
		{
			words += split(line, ' ');			
		}

		System.out.println(words);
		// Split a string into an array of words
		//w.replaceAll("[^\\w\\s]",""); // Remove punction characters
		//s.toLowerCase() // Convert a string to lower case 
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}
