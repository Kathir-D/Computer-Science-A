package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit6a_MoreAplus {

  public static String go(String a) {
    int x = a.indexOf("aplus");
    int y = a.lastIndexOf("aplus");
    if (x != y) {
      return "yes";
    } else {
      return "no";
    }
  }
}
/*
Lab Description : Return "yes" if the string contains more than 1 "aplus". Return "no" if it does not
contain more than 1 "aplus".
Sample Data :
dog#cat#pigaplus
pigs#apluscompsci#food
##catgiraffeapluscompsci
apluscatsanddogsaplus###
###
aplusdog#13337#pigaplusprogram
code#H00P#code1234
##wowgira77##eplus
catsandaplusdogsaplus###
7
Sample Output :
no
no
no
yes
no
yes
no
no
yes
no
 */
