package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import static java.lang.System.*;

public class MazeBombs
{
	private char[][] maze;
	private int minBombs;

	public MazeBombs()
	{
		maze = new char[0][0];
		minBombs = Integer.MAX_VALUE;
	}

	public MazeBombs(char[][] m)
	{
		maze = new char[m.length][m[0].length];
		for(int r = 0; r < maze.length; r++)
		{
			for(int c = 0; c < maze[r].length; c++)
			{
				maze[r][c] = m[r][c];
			}
		}
		minBombs = Integer.MAX_VALUE;
	}

	public void findMinBombs()
	{
		Queue<int[]> queue = new LinkedList<>();
		Queue<Integer> bombs = new LinkedList<>();
		boolean[][] visited = new boolean[maze.length][maze[0].length];

		queue.add(new int[]{0, 0});
		bombs.add(0);
		visited[0][0] = true;

		int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

		while(!queue.isEmpty())
		{
			int[] pos = queue.remove();
			int bombCount = bombs.remove();
			int r = pos[0];
			int c = pos[1];

			if(r == maze.length - 1 && c == maze[r].length - 1)
			{
				minBombs = Math.min(minBombs, bombCount);
				continue;
			}

			for(int[] dir : directions)
			{
				int nr = r + dir[0];
				int nc = c + dir[1];

				if(nr >= 0 && nr < maze.length && nc >= 0 && nc < maze[nr].length && !visited[nr][nc])
				{
					visited[nr][nc] = true;
					if(maze[nr][nc] == '.')
					{
						queue.add(new int[]{nr, nc});
						bombs.add(bombCount);
					}
					else if(maze[nr][nc] == '#')
					{
						queue.add(new int[]{nr, nc});
						bombs.add(bombCount + 1);
					}
				}
			}
		}
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

	public int getMinBombs()
	{
		return minBombs;
	}
}
