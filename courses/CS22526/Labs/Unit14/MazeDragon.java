package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import static java.lang.System.*;

public class MazeDragon
{
	private char[][] maze;
	private int minSteps;

	public MazeDragon(char[][] m)
	{
		maze = new char[m.length][m[0].length];
		for(int r = 0; r < maze.length; r++)
		{
			for(int c = 0; c < maze[r].length; c++)
			{
				maze[r][c] = m[r][c];
			}
		}
		minSteps = Integer.MAX_VALUE;
	}

	private boolean isSafe(int r, int c)
	{
		if(r < 0 || r >= maze.length || c < 0 || c >= maze[r].length)
			return false;

		char cell = maze[r][c];
		if(cell == '#' || cell == 'W')
			return false;

		if(cell == 'K' || cell == 'R')
		{
			for(int dr = -3; dr <= 3; dr++)
			{
				for(int dc = -3; dc <= 3; dc++)
				{
					if(Math.abs(dr) + Math.abs(dc) <= 3)
						return false;
				}
			}
		}

		if(cell == 'L' || cell == 'S' || cell == 'E' || cell == 'C' || cell == 'Z' || cell == 'F')
		{
			return false;
		}

		return true;
	}

	private int getMonsterDist(int r, int c, char monster)
	{
		int minDist = Integer.MAX_VALUE;
		for(int mr = 0; mr < maze.length; mr++)
		{
			for(int mc = 0; mc < maze[mr].length; mc++)
			{
				if(maze[mr][mc] == monster)
				{
					int dist = Math.abs(r - mr) + Math.abs(c - mc);
					minDist = Math.min(minDist, dist);
				}
			}
		}
		return minDist;
	}

	public void findPath()
	{
		Queue<int[]> queue = new LinkedList<>();
		Queue<Integer> steps = new LinkedList<>();
		boolean[][] visited = new boolean[maze.length][maze[0].length];

		int startR = 0, startC = 0;
		for(int r = 0; r < maze.length; r++)
		{
			for(int c = 0; c < maze[r].length; c++)
			{
				if(maze[r][c] == 'T')
				{
					startR = r;
					startC = c;
				}
			}
		}

		queue.add(new int[]{startR, startC});
		steps.add(0);
		visited[startR][startC] = true;

		int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

		while(!queue.isEmpty())
		{
			int[] pos = queue.remove();
			int step = steps.remove();
			int r = pos[0];
			int c = pos[1];

			if(maze[r][c] == 'P')
			{
				minSteps = step;
				return;
			}

			for(int[] dir : directions)
			{
				int nr = r + dir[0];
				int nc = c + dir[1];

				if(nr >= 0 && nr < maze.length && nc >= 0 && nc < maze[nr].length && !visited[nr][nc])
				{
					char cell = maze[nr][nc];

					if(cell == '#' || cell == 'W')
						continue;

					int skelDist = getMonsterDist(nr, nc, 'K');
					int creeperDist = getMonsterDist(nr, nc, 'R');
					int otherDist = getMonsterDist(nr, nc, 'L');

					if(skelDist <= 3 || creeperDist <= 3 || otherDist <= 1)
						continue;

					visited[nr][nc] = true;
					queue.add(new int[]{nr, nc});
					steps.add(step + 1);
				}
			}
		}
	}

	public String getResult()
	{
		if(minSteps == Integer.MAX_VALUE)
			return "You can't afford, ford, ford, my diamond sword, sword, sword";
		return String.valueOf(minSteps);
	}
}
