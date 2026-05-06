//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private char[][] maze;
   private boolean exitFound;

	public Maze()
	{
		exitFound = false;
		maze = new char[0][0];
	}

	public Maze(char[][] m)
	{
		exitFound=false;
		maze = new char[m.length][m[0].length];
		for(int r= 0; r<maze.length; r++)
		{
			for(int c =0; c<maze[r].length; c++)
			{
				maze[r][c]=m[r][c];
			}
		}
	}

	public void checkForExitPath(int r, int c)
	{
		if(r == maze.length - 1 && c == maze[r].length - 1)
		{
			exitFound = true;
			return;
		}

		if(r < 0 || r >= maze.length || c < 0 || c >= maze[r].length || maze[r][c] == '#')
		{
			return;
		}

		maze[r][c] = '#';

		if(!exitFound)
			checkForExitPath(r - 1, c);
		if(!exitFound)
			checkForExitPath(r + 1, c);
		if(!exitFound)
			checkForExitPath(r, c - 1);
		if(!exitFound)
			checkForExitPath(r, c + 1);
	}
	
	public boolean found()
	{
		return exitFound;
	}

	public String toString()
	{
		String output="";
		for(int r= 0; r<maze.length; r++)
		{
			for(int c =0; c<maze[r].length; c++)
			{
				output+=maze[r][c]+" ";
			}
			output+="\n";
		}
		return output;
	}
}