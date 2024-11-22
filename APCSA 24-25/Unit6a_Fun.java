//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//If a number greater than 10000, return "fall".  
//If a number is than 9000, return "jump".  
//Otherwise, return "fly".

public class Unit6a_Fun
{
	public static String check( int x )
	{
		if (x > 10000){
			return "fall";
		} if (x < 9000){
			return "jump";
	}else {
			return "fly";
	}
	}
}

/*
Lab Description : If a number greater than 10000, return "fall". If a number is than 9000, return
"jump". Otherwise, return "fly".
Sample Data :
23433
9500
-129
10987
0
9177
0
183712983
Sample Output :
fall
fly
jump
fall
jump
fly
jump
fall
 */