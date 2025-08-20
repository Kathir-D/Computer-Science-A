package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

class Unit8b_StringRemover {

  private String remove;
  private String sentence;

  public Unit8b_StringRemover(String sen, String rem) {
    sentence = sen;
    remove = rem;
  }

  public void removeStrings() {
    int x;

    while ((x = sentence.indexOf(remove)) != -1) {
      if (x > 0) {
        sentence =
          sentence.substring(0, x - 1) +
          sentence.substring(x + remove.length());
      } else {
        sentence = sentence.substring(x + remove.length());
      }
    }
  }

  public String toString() {
    removeStrings();
    return sentence;
  }
}
/*
Lab Description : Remove all occurrences of the removal string from the original string. Each time
you take out the removal string you must also remove the letter that preceded the removal string. After you
remove a string and its leading character, you must check to see if any more occurrences of the removal string
exist.
Sample Data :
xR-MxR-MHelloxR-M R-M
sxsssxssxsxssexssxsesss xs
fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn qwerty
dogdogcatddodogdogdoggog dog
Sample Output :
xR-MxR-MHelloxR-M - String to remove R-M
Hello
sxsssxssxsxssexssxsesss - String to remove xs
sesss
fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn - String to remove qwerty
fun
dogdogcatddodogdogdoggog - String to remove dog
catgog
 */
