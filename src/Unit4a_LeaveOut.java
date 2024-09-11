//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit4a_LeaveOut
{
	//pre : a.length() > 1
	//post : string returned minus character at i
   public static String go( String a, int i)
	{

		return ""+(a.replaceAll(""+a.charAt(i),""));
	}
}