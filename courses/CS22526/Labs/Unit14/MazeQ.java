package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import static java.lang.System.*;

public class MazeQ
{
	private char[][] maze;
	private boolean exitFound;
	private int shortestPath;

	public MazeQ()
	{
		exitFound = false;
		maze = new char[0][0];
		shortestPath = 0;
	}

	public MazeQ(char[][] m)
	{
		exitFound = false;
		maze = new char[m.length][m[0].length];
		for(int r = 0; r < maze.length; r++)
		{
			for(int c = 0; c < maze[r].length; c++)
			{
				maze[r][c] = m[r][c];
			}
		}
		shortestPath = 0;
	}

	public void findShortestPath()
	{
		Queue<int[]> queue = new LinkedList<>();
		Queue<Integer> steps = new LinkedList<>();
		boolean[][] visited = new boolean[maze.length][maze[0].length];

		queue.add(new int[]{0, 0});
		steps.add(0);
		visited[0][0] = true;

		int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

		while(!queue.isEmpty())
		{
			int[] pos = queue.remove();
			int step = steps.remove();
			int r = pos[0];
			int c = pos[1];

			if(r == maze.length - 1 && c == maze[r].length - 1)
			{
				exitFound = true;
				shortestPath = step;
				return;
			}

			for(int[] dir : directions)
			{
				int nr = r + dir[0];
				int nc = c + dir[1];

				if(nr >= 0 && nr < maze.length && nc >= 0 && nc < maze[nr].length 
					&& maze[nr][nc] == '.' && !visited[nr][nc])
				{
					visited[nr][nc] = true;
					queue.add(new int[]{nr, nc});
					steps.add(step + 1);
				}
			}
		}
	}

	public boolean found()
	{
		return exitFound;
	}

	public int getSteps()
	{
		return shortestPath;
	}

	public String toString()
	{
		String output = "";
		for(int r = 0; r < maze.length; r++)
		{
			for(int c = 0; c < maze[r].length; c++)
			{
				output += maze[r][c] + " ";
			}
			output += "\n";
		}
		return output;
	}
}
