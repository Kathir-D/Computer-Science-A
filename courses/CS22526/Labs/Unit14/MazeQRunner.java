package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MazeQRunner
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File("courses/CS22526/Labs/Unit14/maze_short.dat"));
		while(file.hasNext())
		{
			int rc = file.nextInt();
			char[][] maze = new char[rc][rc];
			file.nextLine();

			for(int r = 0; r < rc; r++)
			{
				char[] ln = file.next().toCharArray();
				for(int c = 0; c < rc; c++)
				{
					maze[r][c] = ln[c];
				}
				file.nextLine();
			}

			MazeQ test = new MazeQ(maze);

			System.out.println(test);

			test.findShortestPath();

			if(test.found())
				System.out.println(test.getSteps() + " steps\n");
			else
				System.out.println("no exit found\n");
		}

		file.close();
	}
}
