package CS22526.Labs.Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class HistogramList2Runner
{
	public static void main(String[] args)
	{
		// Test 1: Characters
		HistoList test = new HistoList();
		String testString = "ABCDEFABCDEFFEDCBAAAAABBBBBCCCDAAAAAAAEEFFF";
		for(char c : testString.toCharArray())
		{
			test.add(c);
		}
		System.out.println(test);

		// Test 2: Integers
		test = new HistoList();
		int[] intArray = {11, 22, 33, 44, 55, 66, 33, 44, 22, 11, 11, 11, 11, 22, 11, 11, 11};
		for(int num : intArray)
		{
			test.add(num);
		}
		System.out.println(test);
		
		// Test 3: Doubles
		test = new HistoList();
		double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 3.3, 4.4, 2.2, 1.1, 1.1, 1.1, 1.1, 2.2, 1.1};
		for(double num : doubleArray)
		{
			test.add(num);
		}
		System.out.println(test);
		
		// Test 4: Demonstrate bad data check (mixed types)
		test = new HistoList();
		test.add("dog");
		test.add(33);
		test.add(3.4);
		System.out.println(test);
	}
}