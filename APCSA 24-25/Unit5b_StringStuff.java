//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit5b_StringStuff
{
	private String word;

	//add in a setString method with one String parameter // what does this do?

	public Unit5b_StringStuff(String a){
		word = a;

		toString();
	}

 	public boolean isEvenLength()
 	{
		 if (word.length() %2 == 0){
			 return true;
		 }
		return false;
	}
	
	public boolean endsWith( String b )
	{
		if (word.endsWith(b)){
			return true;
		}
		return false;			
	}
	
 	public boolean sameFirstLastLetters()
 	{
		 if (word.substring(0,1).equals(word.substring(word.length()-1,word.length()))){
			 return true;
		 }
 	 	return false;
	}

 	public String toString()
 	{
 		return "";
	}
}

/*
Lab Description : Write a class that will take in a String. Check that string to see if it has an even
length. Check the string to see if it ends with a group of letters or single letter. Check the string to see if it has
the same first and last letters.
Sample Data :
Shown below
Sample Output :
Enter a word :: chickencat
has even length true
has same first last letters false
ends with cat true
Enter a word :: itwasafuntripitwas
has even length true
has same first last letters false
ends with it false
 */