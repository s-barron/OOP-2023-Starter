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

	String[] words;

	public void loadFile()
	{
		String[] lines = loadStrings("small.txt"); // Load a text file into a String array
		String allWords = " ";

		for(String line : lines)
		{
			allWords += ' ' + line;		
		}
		
		allWords = allWords.replaceAll("[^\\w\\s]",""); // Remove punction characters
		allWords = allWords.toLowerCase();

		words = split(allWords, ' ');

		/* 
		for(String word: words)
		{
			System.out.println(word + ' ');
		}
		*/
	}

	public int findWord(String str)
	{
		int count = 0;
		for(String word: words)
		{
			if(word == str)
			{
				count++;
			}
		}
		return count;
	}

	public void printModel()
	{
		
				
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
