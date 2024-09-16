//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

public class Unit4a_Social
{
    private String socialNum;
    private int sum;

    public Unit4a_Social(String soc) {
        socialNum = soc;
        chopAndAdd();
    }

    public void chopAndAdd() {
        String[] parts = socialNum.split("-");
        sum = 0;

        for (String part : parts){
            sum += Integer.parseInt(part);
        }
    }

    public String toString() {
        return "SS# " + socialNum + " has a total of " + sum + "\n";
    }
}