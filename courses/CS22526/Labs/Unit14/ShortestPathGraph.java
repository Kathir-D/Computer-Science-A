package CS22526.Labs.Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class ShortestPathGraph
{
	private TreeMap<String, String> map;
	private boolean found;
	private int shortest;

	public ShortestPathGraph(String line)
	{
		map = new TreeMap<>();
		found = false;
		shortest = Integer.MAX_VALUE;

		String[] list = line.trim().split("\\s+");
		for(String piece : list)
		{
			if(piece.length() != 2)
				continue;

			String first = piece.substring(0, 1);
			String second = piece.substring(1, 2);

			map.putIfAbsent(first, "");
			map.putIfAbsent(second, "");

			String val = map.get(first);
			if(!val.contains(second))
				map.put(first, val + second);

			val = map.get(second);
			if(!val.contains(first))
				map.put(second, val + first);
		}
	}

	public boolean contains(String letter)
	{
		return map.containsKey(letter);
	}

	public void check(String first, String second, String placesUsed, int steps)
	{
		if(first.equals(second))
		{
			found = true;
			if(steps < shortest)
				shortest = steps;
			return;
		}

		String neighbors = map.get(first);
		for(int i = 0; i < neighbors.length(); i++)
		{
			String next = neighbors.substring(i, i + 1);
			if(!placesUsed.contains(next))
			{
				check(next, second, placesUsed + next, steps + 1);
			}
		}
	}

	public String toString()
	{
		if(found)
			return "yes in " + shortest + " steps";
		return "no";
	}
}