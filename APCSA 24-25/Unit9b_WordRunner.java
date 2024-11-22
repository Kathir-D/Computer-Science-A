//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Unit9b_WordRunner
{
	public static void main ( String[] args )
	{
		Unit9b_Word word1 = new Unit9b_Word("Hello");
		System.out.println(word1.toString());

		Unit9b_Word word2 = new Unit9b_Word("World");
	  	System.out.println(word2.toString());

  		Unit9b_Word word3 = new Unit9b_Word("JukeBox");
		System.out.println(word3.toString());

	  	Unit9b_Word word4 = new Unit9b_Word("TCEA");
  		System.out.println(word4);

  		Unit9b_Word word5 = new Unit9b_Word("UIL");
  		System.out.println(word5.toString());
 }
}

/*
Lab Goal : This lab was designed to teach you more about loops and the String class.
Lab Description : Take in one word and output the first letter, last letter, and the word backwards.
Sample Data :
Hello
World
JukeBox
TCEA
UIL
Sample Output :
H
o
olleH
Hello
W
d
dlroW
World
J
x
xoBekuJ
JukeBox
T
A
AECT
TCEA
U
L
LIU
UIL
Files Needed ::
Word.java
WordRunner.java
A+ Computer Science BACKWARDS
STRING
\
 */