package CS22526.Labs.Unit10;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class WordTester
{
	public static void main(String[] args)
	{
		Word one = new Word("45alligator");
		System.out.println(one.hashCode()); // should output 4

		Word two = new Word("cat");
		System.out.println(two.hashCode()); // should output 3

		Word three = new Word("whootit");
		System.out.println(three.hashCode()); // should output 1

	}
}