//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design your Cup class
//write all code for your Cup class here
//test your Cup class with the CupRunner

//make a Cup

	//add needed instance variables
	//you will need more than 1
	
	//add constructors and methods
class Unit12a_Cup{
    private int cap;
    private double amt;
    private int addAmt;

    public Unit12a_Cup(){
        cap = 0;
        amt = 0;
        addAmt = 0;
    }

    public void emptyCheck(){
        if (amt <= 0){
            amt = 0;
        }
    }

    public Unit12a_Cup(int a){
        cap = a;
        emptyCheck();
    }

    public void pour(int a){
        amt =- a;
        emptyCheck();
    }

    public double getAmtInCup(){
        return amt;
    }

    public double add(int a){
        emptyCheck();
        amt += a;
        addAmt++;
        return 0.0;
    }

    public boolean willOverflow(int a) {
        emptyCheck();
        if ((a + amt) > cap) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumAdds(){
        return addAmt;
    }

    public boolean isFull(){
        if (cap == amt){
            return true;
        }
        return false;
    }

    public double addLots(double[] a){
        for (int i = 0; i < a.length; i++){
            amt =+ a[i];
            addAmt++;
        }
        return 0.0;
    }

}



/*
Lab Goal : This lab was designed to teach you more designing and writing classes. Use the same runner
code below and associated comments to create a Cup class.
Lab Description : Write a Cup class that will simulate storing liquid in a cup. You can add to the cup
and pour from the cup.
 */