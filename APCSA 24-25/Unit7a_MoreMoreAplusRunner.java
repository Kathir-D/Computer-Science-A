//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit7a_MoreMoreAplusRunner {

  public static void main(String args[]) {
    Unit7a_MoreMoreAplus s = new Unit7a_MoreMoreAplus();
    System.out.println(s.go("rundm"));
    System.out.println(s.go("thweekendaplus"));
    System.out.println(s.go("aplusxxxaplus"));
    System.out.println(s.go("apluaplus"));
    System.out.println(s.go("pigs#apluscompsci#food"));
    System.out.println(s.go("##catgiraffeapluscompsci"));
    System.out.println(s.go("apluscatsanddogsaplus###"));
    System.out.println(s.go("##"));
    System.out.println(s.go("aplusdog#13337#pigaplusprogram"));
    System.out.println(s.go("code#H00P#code1234"));
    System.out.println(s.go("##wowgira77##eplus"));
    System.out.println(s.go("catsandaplusdogsaplus###"));
    System.out.println(s.go("7"));
  }
}
/*
Lab Goal : This lab will focus on strings, decision making [ if, if else, and if else if statements ], and logical
operators.
Lab Description :
Return "a" if the string does not contain an occurrence of "aplus" and has an odd length.
Return "plus" if the string has at least 1 occurrence of "aplus" and the length is even.
Return "comp" if an "aplus" if found starting at position 0 and at the end of the string.
Return "sci" in all other situations.
Sample Data :
"rundm"
"thweekendaplus"
"aplusxyzaplus"
"apluaplus"
"pigs#apluscompsci#food"
"##catgiraffeapluscompsci"
"apluscatsanddogsaplus###"
"##"
"aplusdog#13337#pigaplusprogram"
"code#H00P#code1234"
"##wowgira77##eplus"
"catsandaplusdogsaplus###"
"7"
Sample Output :
a
plus
comp
sci
plus
plus
plus
sci
plus
sci
sci
plus
a
 */
