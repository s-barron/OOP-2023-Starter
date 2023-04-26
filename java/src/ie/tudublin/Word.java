package ie.tudublin;

import java.util.ArrayList;

public class Word {
    
    private String word;

    ArrayList<Follow> follows = new ArrayList<Follow>();

    public Word(String word, ArrayList<Follow> follows)
    {
        this.word = word;
        this.follows = follows;
    }

    public int findFollow(String str)
	{
		int count = 0;
		for(Follow f: follows)
		{
			if(f.getWord() == str)
			{
				count++;
			}
        }
		return count;     
    }
    @Override
    public String toString()
    {
        String retString = "";
        for(Follow f: follows)
        {
            retString += f.getWord() + ": \n";
        }        
        return retString;
    }


    public String getWord() {
        return word;
    }

    public ArrayList<Follow> getFollows() {
        return follows;
    }

}
    
