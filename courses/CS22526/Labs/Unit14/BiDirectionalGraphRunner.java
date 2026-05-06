//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import static java.lang.System.*;

public class BiDirectionalGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("courses/CS22526/Labs/Unit14/bidgraph.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();

		for(int x = 0; x < howManyTimes; x++)
		{
			String input = file.nextLine();
			BiDirectionalGraph test = new BiDirectionalGraph(input);

			input = file.nextLine();
			String[] parts = input.trim().split("\\s+");
			String start = parts[0];
			String end = parts[1];

			TreeSet<String> visited = new TreeSet<>();
			test.check(start, end, visited);

			out.println(start + " CONNECTS TO " + end + " == " + test);
		}
	}
}