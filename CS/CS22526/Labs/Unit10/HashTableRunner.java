package CS22526.Labs.Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;

public class HashTableRunner
{
  public static void main ( String[] args )
  {
		try{
			HashTable numberTable = new HashTable();
			Scanner numIn = new Scanner(new File("CS/CS22526/Labs/Unit10/numbers.dat"));
			while(numIn.hasNextInt())
			{
				numberTable.add(new Number(numIn.nextInt()));
			}
			numIn.close();
			out.println(numberTable);

			HashTable wordTable = new HashTable();
			Scanner wordIn = new Scanner(new File("CS/CS22526/Labs/Unit10/words.dat"));
			int size = wordIn.hasNextInt() ? wordIn.nextInt() : 0;
			for (int i = 0; i < size && wordIn.hasNext(); i++)
			{
				wordTable.add(new Word(wordIn.next()));
			}
			wordIn.close();
			out.println(wordTable);
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem! " + e.getMessage());
		}
  }

}
