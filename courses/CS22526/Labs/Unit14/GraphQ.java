package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class GraphQ
{
	private HashMap<String, HashSet<String>> map;
	private boolean found;

	public GraphQ(String line)
	{
		map = new HashMap<String, HashSet<String>>();
		String[] list = line.trim().split("\\s+");
		for(String piece : list)
		{
			if(piece.length() != 2)
				continue;

			String first = piece.substring(0,1);
			String second = piece.substring(1,2);

			map.putIfAbsent(first, new HashSet<String>());
			map.putIfAbsent(second, new HashSet<String>());
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
		found = false;
		if(first == null || second == null || !contains(first) || !contains(second))
			return;

		Queue<String> q = new LinkedList<String>();
		Set<String> visited = new HashSet<String>();

		q.add(first);
		visited.add(first);

		while(!q.isEmpty() && !found)
		{
			String current = q.remove();
			if(current.equals(second))
			{
				found = true;
				return;
			}

			HashSet<String> nexts = map.get(current);
			if(nexts == null)
				continue;

			for(String next : nexts)
			{
				if(!visited.contains(next))
				{
					visited.add(next);
					q.add(next);
				}
			}
		}
	}

	public String toString()
	{
		if(found)
		   return "CONNECTS";
		return "DOES NOT CONNECT";
	}
}
