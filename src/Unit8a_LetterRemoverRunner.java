//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit8a_LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Unit8a_LetterRemover s = new Unit8a_LetterRemover();

		System.out.println(s.removeLetters("ssssssssxssssesssssesss", 's'));
		System.out.println(s.removeLetters("qwertyqwertyqwerty", 'a'));
		System.out.println(s.removeLetters("abababababa", 'b'));
		System.out.println(s.removeLetters("abaababababa", 'x'));

	}
}


/*
Lab Goal : This lab was designed to teach you how to use a while loop.
Lab Description : Remove all instances of the specified removal letter from the original sentence.
Sample Data :
I am Sam I am a
ssssssssxssssesssssesss s
qwertyqwertyqwerty a
abababababa b
abaababababa x
Sample Output :
I am Sam I am - letter to remove a
I m Sm I m
ssssssssxssssesssssesss - letter to remove s
xee
qwertyqwertyqwerty - letter to remove a
qwertyqwertyqwerty
abababababa - letter to remove b
aaaaaa
abaababababa - letter to remove x
abaababababa
 */