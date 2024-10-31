//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Unit9b_Word
{
	private String word;

	public Unit9b_Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		StringBuilder backs = new StringBuilder();

		for (int i = word.length() - 1; i >= 0; i--){
			backs.append(word.charAt(i));
		}

        return String.valueOf(backs);
	}

 	public String toString()
 	{
		 return "First character: " + getFirstChar() + "\n" +
         "Last character: " + getLastChar() + "\n" +
         "Backwards: " + getBackWards() + "\n" +
         "Original word: " + word + "\n";
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