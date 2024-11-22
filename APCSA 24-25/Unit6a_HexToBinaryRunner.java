//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class Unit6a_HexToBinaryRunner
{
	public static void main( String args[] )
	{
		Unit6a_HexToBinary prog = new Unit6a_HexToBinary();
		
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);		
		out.println( prog.getBinary( letter ) );  
			
		//add more test cases
	}
}