package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class GraphRun
{
	private int distance;
	private int mainRoad;

	public GraphRun(int mainDist, int[][] adj)
	{
		mainRoad = mainDist;
		distance = dijkstra(adj, 0);
	}

	private int dijkstra(int[][] adj, int src)
	{
		int V = adj.length;

		// Min-heap (priority queue) storing pairs of (distance, node)
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

		// Distance array: stores shortest distance from source
		int[] dist = new int[V];
		Arrays.fill(dist, Integer.MAX_VALUE);

		// Distance from source to itself is 0
		dist[src] = 0;
		pq.offer(new int[]{0, src});

		// Process the queue until all reachable vertices are finalized
		while (!pq.isEmpty()) {
			int[] top = pq.poll();
			int d = top[0];
			int u = top[1];

			// If this distance is not the latest shortest one, skip it
			if (d > dist[u])
				continue;

			// Explore all adjacent vertices
			for (int v = 0; v < V; v++) {
				int w = adj[u][v];

				// If there's an edge and we found a shorter path to v through u, update it
				if (w != 0 && dist[u] + w < dist[v]) {
					dist[v] = dist[u] + w;
					pq.offer(new int[]{dist[v], v});
				}
			}
		}

		return dist[V - 1];
	}

	public String toString()
	{
		if(distance < mainRoad)
			return "Safe at last.";
		return "This is the end of me!";
	}
}
