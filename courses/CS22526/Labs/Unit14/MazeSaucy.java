package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import static java.lang.System.*;

public class MazeSaucy
{
	private char[][] maze;
	private int minSteps;
	private int timeLimit;
	private int wheelsNeeded;
	private int wheelsCollected;

	public MazeSaucy(char[][] m, int time)
	{
		maze = new char[m.length][m[0].length];
		for(int r = 0; r < maze.length; r++)
		{
			for(int c = 0; c < maze[r].length; c++)
			{
				maze[r][c] = m[r][c];
			}
		}
		timeLimit = time;
		minSteps = Integer.MAX_VALUE;
		wheelsNeeded = 0;
		wheelsCollected = 0;

		for(int r = 0; r < maze.length; r++)
		{
			for(int c = 0; c < maze[r].length; c++)
			{
				if(maze[r][c] == 'o')
					wheelsNeeded++;
			}
		}
	}

	private boolean canPass(int r, int c, int phase)
	{
		char cell = maze[r][c];
		if(cell == '#')
			return false;
		if(cell == 'S' || cell == '.')
			return true;
		if(cell == '1')
			return phase == 1;
		if(cell == '2')
			return phase == 2;
		if(cell == '3')
			return phase == 3;
		if(cell == 'o')
			return true;
		return false;
	}

	public void solveMaze()
	{
		Queue<Integer[]> queue = new LinkedList<>();
		Queue<Integer> steps = new LinkedList<>();
		Queue<Integer> wheels = new LinkedList<>();
		Set<String> visited = new HashSet<>();

		int startR = 0, startC = 0;
		for(int r = 0; r < maze.length; r++)
		{
			for(int c = 0; c < maze[r].length; c++)
			{
				if(maze[r][c] == 'S')
				{
					startR = r;
					startC = c;
				}
			}
		}

		queue.add(new Integer[]{startR, startC, 1});
		steps.add(0);
		wheels.add(0);

		int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

		while(!queue.isEmpty())
		{
			Integer[] pos = queue.remove();
			int step = steps.remove();
			int wheelCount = wheels.remove();
			int r = pos[0];
			int c = pos[1];
			int phase = pos[2];

			if(step > timeLimit)
				continue;

			int nextPhase = phase == 3 ? 1 : phase + 1;

			boolean isExit = false;
			if(maze[r][c] == '.')
			{
				for(int dr = -1; dr <= 1; dr++)
				{
					for(int dc = -1; dc <= 1; dc++)
					{
						int nr = r + dr;
						int nc = c + dc;
						if(nr < 0 || nr >= maze.length || nc < 0 || nc >= maze[r].length)
							isExit = true;
					}
				}
			}

			if(isExit && wheelCount == wheelsNeeded && step <= timeLimit)
			{
				minSteps = Math.min(minSteps, step);
				continue;
			}

			int newWheels = wheelCount;
			if(maze[r][c] == 'o')
				newWheels++;

			String key = r + "," + c + "," + phase + "," + newWheels;
			if(visited.contains(key))
				continue;
			visited.add(key);

			for(int[] dir : directions)
			{
				int nr = r + dir[0];
				int nc = c + dir[1];

				if(nr >= 0 && nr < maze.length && nc >= 0 && nc < maze[nr].length)
				{
					if(canPass(nr, nc, phase))
					{
						queue.add(new Integer[]{nr, nc, nextPhase});
						steps.add(step + 1);
						wheels.add(newWheels);
					}
				}
			}
		}
	}

	public String getResult()
	{
		if(wheelsNeeded == 0)
			return "The sauce is inevitable.";
		if(minSteps == Integer.MAX_VALUE)
			return "We got lost in the sauce. Call us Gucci Mane.";
		return "Cruisin on down Main Street. We made it out in " + minSteps + " steps!";
	}
}
