package CS22526.Labs.Unit14;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class GraphRun {

  private int distance;
  private int mainRoad;

  public GraphRun(int mainDist, int[][] graph) {
    mainRoad = mainDist;
    distance = dijkstra(graph, 0);
  }

  private int dijkstra(int[][] graph, int sourceVertex) {
    int vertexCount = graph.length;
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->
      Integer.compare(a[0], b[0])
    );

    int[] dist = new int[vertexCount];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[sourceVertex] = 0;
    pq.offer(new int[] { 0, sourceVertex });

    while (!pq.isEmpty()) {
      int[] current = pq.poll();
      int currentDistance = current[0];
      int currentVertex = current[1];

      if (currentDistance > dist[currentVertex]) continue;

      for (int neighbor = 0; neighbor < vertexCount; neighbor++) {
        int edgeWeight = graph[currentVertex][neighbor];

        if (
          edgeWeight != 0 && dist[currentVertex] + edgeWeight < dist[neighbor]
        ) {
          dist[neighbor] = dist[currentVertex] + edgeWeight;
          pq.offer(new int[] { dist[neighbor], neighbor });
        }
      }
    }

    return dist[vertexCount - 1];
  }

  public String toString() {
    if (distance < mainRoad) return "Safe at last.";
    return "This is the end of me!";
  }
}
