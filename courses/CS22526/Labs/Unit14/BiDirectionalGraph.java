//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class BiDirectionalGraph
{
	private TreeMap<String, TreeSet<String>> map;
	private boolean found;

	public BiDirectionalGraph(String line)
	{
		map = new TreeMap<>();
		found = false;

		String[] list = line.trim().split("\\s+");
		for(int i = 0; i < list.length; i += 2)
		{
			if(i + 1 < list.length)
			{
				String first = list[i];
				String second = list[i + 1];

				map.putIfAbsent(first, new TreeSet<>());
				map.putIfAbsent(second, new TreeSet<>());
				map.get(first).add(second);
				map.get(second).add(first);
			}
		}
	}

	public boolean contains(String name)
	{
		return map.containsKey(name);
	}

	public void check(String first, String second, TreeSet<String> placedUsed)
	{
		if(!contains(first) || !contains(second))
		{
			found = false;
			return;
		}

		if(first.equals(second))
		{
			found = true;
			return;
		}

		placedUsed.add(first);
		TreeSet<String> connections = map.get(first);

		for(String next : connections)
		{
			if(!placedUsed.contains(next))
			{
				check(next, second, placedUsed);
				if(found)
					return;
			}
		}
	}

	public String toString()
	{
		if(found)
			return "YAH";
		return "NAH";
	}
}