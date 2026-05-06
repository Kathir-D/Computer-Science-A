package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import static java.lang.System.*;

public class MazeSoul
{
	private char[][] maze;
	private boolean soulFound;

	public MazeSoul(char[][] m)
	{
		maze = new char[m.length][m[0].length];
		for(int r = 0; r < maze.length; r++)
		{
			for(int c = 0; c < maze[r].length; c++)
			{
				maze[r][c] = m[r][c];
			}
		}
		soulFound = false;
	}

	public void findSoul()
	{
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[maze.length][maze[0].length];

		int startR = 0, startC = 0;
		for(int r = 0; r < maze.length; r++)
		{
			for(int c = 0; c < maze[r].length; c++)
			{
				if(maze[r][c] == 'Y')
				{
					startR = r;
					startC = c;
				}
			}
		}

		queue.add(new int[]{startR, startC});
		visited[startR][startC] = true;

		int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

		while(!queue.isEmpty())
		{
			int[] pos = queue.remove();
			int r = pos[0];
			int c = pos[1];

			if(maze[r][c] == 'S')
			{
				soulFound = true;
				return;
			}

			for(int[] dir : directions)
			{
				int nr = r + dir[0];
				int nc = c + dir[1];

				if(nr >= 0 && nr < maze.length && nc >= 0 && nc < maze[nr].length && !visited[nr][nc])
				{
					if(maze[nr][nc] != '#')
					{
						visited[nr][nc] = true;
						queue.add(new int[]{nr, nc});
					}
				}
			}
		}
	}

	public String getResult()
	{
		if(soulFound)
			return "Should really be more careful next time...";
		return "A wall! My only weakness!";
	}
}
