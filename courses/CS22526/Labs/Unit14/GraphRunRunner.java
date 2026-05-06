package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GraphRunRunner
{
	public static void main(String[] args) throws IOException
	{
		Scanner file = new Scanner(new File("courses/CS22526/Labs/Unit14/run.dat"));
		int cases = file.nextInt();

		for(int i = 0; i < cases; i++)
		{
			int mainDist = file.nextInt();
			int size = file.nextInt();

			int[][] adj = new int[size][size];
			for(int r = 0; r < size; r++)
			{
				for(int c = 0; c < size; c++)
				{
					adj[r][c] = file.nextInt();
				}
			}

			GraphRun test = new GraphRun(mainDist, adj);
			out.println(test);
		}

		file.close();
	}
}
