package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MazeSoulRunner
{
	public static void main(String args[]) throws IOException
	{
		Scanner file = new Scanner(new File("courses/CS22526/Labs/Unit14/soul.dat"));
		int numCases = file.nextInt();

		for(int i = 0; i < numCases; i++)
		{
			int rows = file.nextInt();
			int cols = file.nextInt();
			file.nextLine();

			char[][] maze = new char[rows][cols];
			for(int r = 0; r < rows; r++)
			{
				String line = file.nextLine();
				for(int c = 0; c < cols && c < line.length(); c++)
				{
					maze[r][c] = line.charAt(c);
				}
			}

			MazeSoul test = new MazeSoul(maze);
			test.findSoul();
			System.out.println(test.getResult());
		}

		file.close();
	}
}
