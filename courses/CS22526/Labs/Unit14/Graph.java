package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class Graph
{
	private HashMap<String, HashSet<String>> map;
	private boolean found;

	public Graph(String line)
	{
		map = new HashMap<>();

		String[] list = line.trim().split("\\s+");
		for(String piece : list)
		{
			if(piece.length() != 2)
				continue;

			String first = piece.substring(0, 1);
			String second = piece.substring(1, 2);

			map.putIfAbsent(first, new HashSet<>());
			map.putIfAbsent(second, new HashSet<>());
			map.get(first).add(second);
			map.get(second).add(first);
		}

		found = false;
	}

	public boolean contains(String letter)
	{
		return map.containsKey(letter);
	}

	public void check(String first, String second)
	{
		if(first == null || second == null || !contains(first) || !contains(second))
		{
			found = false;
			return;
		}

		HashSet<String> visited = new HashSet<>();
		found = checkPath(first, second, visited);
	}

	private boolean checkPath(String current, String target, HashSet<String> visited)
	{
		if(current.equals(target))
			return true;

		visited.add(current);
		HashSet<String> connections = map.get(current);
		if(connections == null)
			return false;

		for(String next : connections)
		{
			if(!visited.contains(next) && checkPath(next, target, visited))
				return true;
		}

		return false;
	}

	public String toString()
	{
		if(found)
		   return "CONNECTS";
		return "DOES NOT CONNECT";
	}
}
