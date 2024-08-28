//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Scanner;
import static java.lang.System.*;

public class Unit2_HomeRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );
		Unit2_Home obj = new Unit2_Home();

		out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();

		int x;
		x = (int) obj.getDistance(x1,y1,x2,y2);
		out.println(Math.abs(x));
					
	}
}

/*

Sample Data :
4 -8 5 -3
10 -4 -2 5
5 -11  18 -6
 


Sample Output : 
Enter X1 :: 4
Enter Y1 :: -8
Enter X2 :: 5
Enter Y2 :: -3
distance == 2


Enter X1 :: 10
Enter Y1 :: -4
Enter X2 :: -2
Enter Y2 :: 5
distance == 9


Enter X1 :: 5
Enter Y1 :: -11
Enter X2 :: 18
Enter Y2 :: -6
distance == 6




Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 0
Enter Y2 :: 0
distance == 1.414

*/