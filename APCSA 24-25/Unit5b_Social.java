//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Unit5b_Social {

  private String num;

  public Unit5b_Social(String n) {
    num = n;
  }

  private boolean isValid() {
    if (num.substring(3, 4).equals("-") && num.substring(6, 7).equals("-")) {
      return true;
    }

    return false;
  }

  public String go() {
    String[] parts = num.split("-");
    if (isValid()) {
      return parts[2];
    } else {
      return "bad";
    }
  }
}
/*
Lab Description : Given a string, check to see if the string is a valid social security number. For this
program, social security numbers have a hyphen – at position 3 and at position 6. Return the last 4 numbers if
the social security number is valid. Return bad if the social security number is invalid.
Sample Data :
463-44-5678
46-144-5678
111-44-5678
463044-5678
463-99-8888
123-11-5323
463-4-55678
46314415678
Sample Output :
5678
bad
5678
bad
8888
5323
bad
bad
 */
