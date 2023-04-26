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
	String[] follows;

	public void loadFile()
	{
		String[] lines = loadStrings("small.txt"); // Load a text file into a String array
		String allWords = " ";

		for(String line : lines)
		{
			allWords += ' ' + line;		
		}
		
		allWords = allWords.replaceAll("[^\\w\\s]",""); // Remove punctuation characters
		allWords = allWords.toLowerCase();

		words = split(allWords, ' ');

		ArrayList<Follow> follows = new ArrayList<Follow>();


		int count = 0;
		
		for(int i = 0; i < words.length-1; i++)
		{
			
			for(int j = 1; j < words.length-1; j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
				}
			}

		Follow f = new Follow(words[i], count);
		follows.add(f);
		System.out.println(f);
		}
		
		/* 
		for(int k = 0; k < words.length; k++)
		{
			for(int l = 1; l < words.length; l++)
			{
				if(follows.get(k).getWord() == words[l])
				{

				}
			}
		}
		*/


		/* 
		for(String word: words)
		{
			System.out.println(word + ' ');
		}
		*/
	}

	public boolean findWord(String str)
	{
		boolean bool = true;
		for(String word: words)
		{
			if(word == str)
			{
				bool = true;
			}
			else
			{
				bool = false;
			}
		}
		return bool;
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
