package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name

public class Unit9a_CountPairsRunner {

  public static void main(String[] args) {
    System.out.println(Unit9a_CountPairs.pairCounter("ddogccatppig")); // 3
    System.out.println(Unit9a_CountPairs.pairCounter("dogcatpig")); // 0
    System.out.println(Unit9a_CountPairs.pairCounter("xxyyzz")); // 3
    System.out.println(Unit9a_CountPairs.pairCounter("a")); // 0
    System.out.println(Unit9a_CountPairs.pairCounter("abc")); // 0
    System.out.println(Unit9a_CountPairs.pairCounter("aabb")); // 2
    System.out.println(Unit9a_CountPairs.pairCounter("dogcatpigaabbcc")); // 3
    System.out.println(Unit9a_CountPairs.pairCounter("aabbccdogcatpig")); // 3
    System.out.println(Unit9a_CountPairs.pairCounter("dogabbcccatpig")); // 3
    System.out.println(Unit9a_CountPairs.pairCounter("aaaa")); // 3
    System.out.println(Unit9a_CountPairs.pairCounter("AAAAAAAAA")); // 8
  }
}
/*
Lab Goal : This lab will focus on loops, variables, if statements, and strings.
Lab Description : Write a program that will go through a string and count up the number of letter pairs
present. A letter pair is any two adjacent letters with the same value.
"doggy" contains 1 letter pair.
"mississippi" contains 3 letter pairs.
The last letter in a pair can be used to create another new pair.
"aaaaaa" contains 5 letter pairs.
Basic for loop syntax :
for(int x=5; x<200; x=x+20)
{
//do something
}
Sample Data
ddogccatppig
dogcatpig
xxyyzz
a
abc
aabb
dogcatpigaabbcc
aabbccdogcatpig
dogabbcccatpig
aaaa
AAAAAAAAA
Sample Output
3
0
3
0
0
2
3
3
3
3
8
Files Needed ::
CountPairs.java
CountPairsRunner.java
A+ Computer Science COUNT PAIRS

 */
