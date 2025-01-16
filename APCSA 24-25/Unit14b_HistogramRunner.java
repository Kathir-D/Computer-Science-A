// (c)A+ Computer Science
// www.apluscompsci.com
// Name -
// Date -

public class Unit14b_HistogramRunner
{
	public static void main(String args[])
	{
		Unit14b_Histogram hist = new Unit14b_Histogram("1 5 3 4 5 5 5 4 3 2 5 5 5 3", 8);
		System.out.println( hist );
		hist.changeCount( 3, 1 );   	
		hist.changeCount( 13, 5 );		
		hist.changeCount( 5, -2 );		
		hist.changeCount( 2 , 3 ); 
		System.out.println( hist ); 	
		System.out.println( hist.getMax() );
		
		System.out.println("");
		
		hist.reset("1 1 1 -91 1 1 1 5 3 3 3 99 5 5 3", 6);
		System.out.println( hist );
		hist.changeCount( 5, 10 );   	
		hist.changeCount( 1, -3 );	
		hist.changeCount( 4, 10203 );	
		hist.changeCount( 0, 7 );		
		hist.changeCount( 2 , 3 );  	
		System.out.println( hist ); 	
		System.out.println( hist.getMax() );		
	}
}

/*
expected output

0 - 0 | 1 - 1 | 2 - 1 | 3 - 3 | 4 - 2 | 5 - 7 | 6 - 0 | 7 - 0 |
0 - 0 | 1 - 1 | 2 - 4 | 3 - 4 | 4 - 2 | 5 - 5 | 6 - 0 | 7 - 0 |
5

0 - 0 | 1 - 6 | 2 - 0 | 3 - 4 | 4 - 0 | 5 - 3 |
0 - 7 | 1 - 3 | 2 - 3 | 3 - 4 | 4 - 10203 | 5 - 13 |
4

*/