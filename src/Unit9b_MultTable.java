//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class Unit9b_MultTable
{
	private int number;
	private int stop;

	public Unit9b_MultTable(int n, int s)
	{
		number = n;
		stop = s;
	}

	public void printTable( )
	{
		System.out.println("multiplication table for "  + number);
		for (int i = 1; i < stop + 1; i++){
			System.out.println(i + " " + i*number);
		}
		System.out.println();


	}
}

/*
Lab Goal : This lab was designed to teach you how to use for loops.
Lab Description : Generate the multiplication table for any number up to ten.
Sample Data :
5 5
3 7
1 6
9 9
7 8
Sample Output :
multiplication table for 5
1 5
2 10
3 15
4 20
5 25
multiplication table for 3
1 3
2 6
3 9
4 12
5 15
6 18
7 21
multiplication table for 1
1 1
2 2
3 3
4 4
5 5
6 6
multiplication table for 9
1 9
2 18
3 27
4 36
5 45
6 54
7 63
8 72
9 81
multiplication table for 7
1 7
2 14
3 21
4 28
5 35
6 42
Files Needed ::
MultTable.java
MultTableRunner.java
A+ Computer Science MULTIPLICATION
TABLE
© A+ Computer Science –for loops - www.apluscompsci.com
7 49
8 56
 */