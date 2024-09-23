//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit5a_First {
	public static String go(String a) {

    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (int i = 0; i < vowels.length; i++) {
        if (a.substring(0, 1).toLowerCase().equals(String.valueOf(vowels[i])) || a.substring(a.length() - 1).toLowerCase().equals(String.valueOf(vowels[i]))) {
            return "yes";
        } else {
			return "no";
		}
    }
    return "";

}

}


/*

EXPECTED RUNNER OUTPUT
 
no
yes
no
no
yes
no
yes
yes
no
no


*/