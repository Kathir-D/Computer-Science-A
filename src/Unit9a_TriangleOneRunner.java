//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Unit9a_TriangleOneRunner
{
	public static void main ( String[] args )
	{
		String[] testCases = {"hippo", "abcd", "it", "a", "chicken"};

        for (String word : testCases) {
            System.out.println("Triangle for word: " + word);
            Unit9a_TriangleOne.print(word);
            System.out.println();
        }
	}
}

/*
© A+ Computer Science – for loops - www.apluscompsci.com
Lab Goal : This lab was designed to teach you how to use for loops and how to make pretty shapes.
Lab Description : Output a word in a fancy triangle. Use substring to print out smaller sections of the
word.
Sample Data :
hippo
abcd
it
a
chicken
Sample Output :
hippo
hipp
hip
hi
h
abcd
abc
ab
a
it
i
a
chicken
chicke
chick
chic
chi
ch
c
algorithm help
for loop i = length-1 down to 0
println substrings
Files Needed ::
TriangleOne.java
TriangleOneRunner.java
A+ Computer Science DECREASING
WORD

 */