//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.Arrays;

public class Unit15a_Doggies
{ // This would be much easier with Hashmaps
	private Unit15a_Dog[] pups;

    public Unit15a_Doggies(int size) {
        pups = new Unit15a_Dog[size];
    }
    
    public void set(int spot, int age, String name) {
        if (spot >= 0 && spot < pups.length) {
            pups[spot] = new Unit15a_Dog(age, name);
        }
    }

	public String getNameOfOldest() {
        if (pups == null || pups.length == 0) {
            return null;
        }
        
        int maxAge = pups[0].getAge();
        String oldestName = pups[0].getName();
        
        for (Unit15a_Dog dog : pups) {
            if (dog.getAge() > maxAge) {
                maxAge = dog.getAge();
                oldestName = dog.getName();
            }
        }
        
        return oldestName;
    }

    public String getNameOfYoungest() {
        if (pups == null || pups.length == 0) {
            return null;
        }
        
        int minAge = pups[0].getAge();
        String youngestName = pups[0].getName();
        
        for (Unit15a_Dog dog : pups) {
            if (dog.getAge() < minAge) {
                minAge = dog.getAge();
                youngestName = dog.getName();
            }
        }
        
        return youngestName;
    }

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}

/*
Lab Goal : This lab was designed to teach you more about arrays of references.
Lab Description : Use the Dog, Doggies, and DoggiesRunner classes. Complete the
getNameOfOldest and getNameOfYoungest methods in the Doggies class.
Sample Output :
How many Dogs are in the pack? :: 5
Enter the age :: 20
Enter the name :: Sammy
Enter the age :: 10
Enter the name :: Benny
Enter the age :: 5
Enter the name :: Wilee
Enter the age :: 30
Enter the name :: Kelley
Enter the age :: 2
Enter the name :: Baby
pack :: [20 Sammy, 10 Benny, 5 Wilee, 30 Kelley, 2 Baby]
NAME OF OLDEST :: Kelley
NAME OF YOUNGEST :: Baby
 */