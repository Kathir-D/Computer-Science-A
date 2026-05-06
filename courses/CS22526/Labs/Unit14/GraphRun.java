package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GraphRun
{
	private int distance;
	private int mainRoad;

	public GraphRun(int mainDist, int[][] adj)
	{
		mainRoad = mainDist;
		distance = dijkstra(adj);
	}

	private int dijkstra(int[][] adj)
	{
		int n = adj.length;
		int[] dist = new int[n];
		boolean[] visited = new boolean[n];

		for(int i = 0; i < n; i++)
		{
			dist[i] = Integer.MAX_VALUE;
		}
		dist[0] = 0;

		for(int count = 0; count < n - 1; count++)
		{
			int u = -1;
			for(int i = 0; i < n; i++)
			{
				if(!visited[i] && (u == -1 || dist[i] < dist[u]))
				{
					u = i;
				}
			}

			if(dist[u] == Integer.MAX_VALUE)
				break;

			visited[u] = true;

			for(int v = 0; v < n; v++)
			{
				if(adj[u][v] != 0 && !visited[v])
				{
					int newDist = dist[u] + adj[u][v];
					if(newDist < dist[v])
					{
						dist[v] = newDist;
					}
				}
			}
		}

		return dist[n - 1];
	}

	public String toString()
	{
		if(distance < mainRoad)
			return "Safe at last.";
		return "This is the end of me!";
	}
}
