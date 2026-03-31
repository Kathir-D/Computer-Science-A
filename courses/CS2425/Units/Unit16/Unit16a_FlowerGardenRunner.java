package CSA2425; //(c) A+ Computer Science

// www.apluscompsci.com

public class Unit16a_FlowerGardenRunner {

  public static void main(String args[]) {
    Unit16a_FlowerGarden fg = new Unit16a_FlowerGarden();
    fg.addFlower("daisy");
    fg.addFlower("rose");
    fg.addFlower("poppy");
    fg.addFlower("sunflower");
    fg.addFlower("daisy");
    System.out.println(fg);
    System.out.println(fg.findFlower("daisy"));
    System.out.println(fg.findFlower("orchid"));
    System.out.println(fg.getCount("daisy"));
    System.out.println(fg.getCount("orchid"));
    System.out.println(fg.getFlowerName(0));
    System.out.println(fg.getFlowerName(9));
    System.out.println(fg.maxFlower());
    fg.addFlower("daisy");
    fg.addFlower("daisy");
    fg.addFlower("rose");
    fg.addFlower("poppy");
    fg.addFlower("daisy");
    fg.addFlower("lily");
    fg.addFlower("lily");
    fg.addFlower("gardenia");
    fg.addFlower("rose");
    fg.addFlower("poppy");
    fg.addFlower("gardenia");
    fg.addFlower("daisy");
    fg.addFlower("lily");
    System.out.println(fg);
    System.out.println(fg.findFlower("lily"));
    System.out.println(fg.findFlower("orchid"));
    System.out.println(fg.getCount("daisy"));
    System.out.println(fg.getCount("orchid"));
    System.out.println(fg.getFlowerName(3));
    System.out.println(fg.getFlowerName(15));
    System.out.println(fg.maxFlower());
  }
}
/*
Lab Goal : This lab was designed to teach you more class and methods using ArrayList and String.
Lab Description :
Create a class that stores an ArrayList of Strings.
The Strings store 2 bits of information about flowers.
The Strings store a count and a name.
You will need to use ParseInt.
“14 Daisy” there are 14 daisies.
“01 Rose” there is one rose.
There are numerous methods.
In order for this program to work correctly, several of the methods must call other methods.
For this problem, you need to make a FlowerGarden class.
The first and only instance variable will be an ArrayList < String >.
The FlowerGarden class will have one constructor that creates a new ArrayList.
The ArrayList stores Strings that store Flower information.
Each String has a count and a flower name.
"14 rose" there are 14 rose flowers in the garden.
The FlowerGarden class will have 8 methods.
The addFlower method adds a new flower to the arraylist - adds “00 flower name”
The findFlower will return the position in the arraylist where the flower is found
The getCount method returns how many of the particular flower is in the garden
The getFlowerName method returns the flower name at a particular position
The maxFlower method returns the name of the flower that exists the garden the most
The inRange method checks to see if a value is in a specified range
The ToString method will return the arraylist instance variable.
A+ Computer Science FLOWER
GARDEN
© A+ Computer Science – ArrayList - www.apluscompsci.com
Runner Code :
FlowerGarden fg = new FlowerGarden();
fg.addFlower( "daisy" );
fg.addFlower( "rose" );
fg.addFlower( "poppy" );
fg.addFlower( "sunflower" );
fg.addFlower( "daisy" );
System.out.println( fg );
System.out.println( fg.findFlower( "daisy" ) );
System.out.println( fg.findFlower( "orchid" ) );
System.out.println( fg.getCount( "daisy" ) );
System.out.println( fg.getCount( "orchid" ) );
System.out.println( fg.getFlowerName( 0 ) );
System.out.println( fg.getFlowerName( 9 ) );
System.out.println( fg.maxFlower() );
fg.addFlower( "daisy" );
fg.addFlower( "daisy" );
fg.addFlower( "rose" );
fg.addFlower( "poppy" );
fg.addFlower( "daisy" );
fg.addFlower( "lily" );
fg.addFlower( "lily" );
fg.addFlower( "gardenia" );
fg.addFlower( "rose" );
fg.addFlower( "poppy" );
fg.addFlower( "gardenia" );
fg.addFlower( "daisy" );
fg.addFlower( "lily" );
System.out.println( fg );
System.out.println( fg.findFlower( "lily" ) );
System.out.println( fg.findFlower( "orchid" ) );
System.out.println( fg.getCount( "daisy" ) );
System.out.println( fg.getCount( "orchid" ) );
System.out.println( fg.getFlowerName( 3 ) );
System.out.println( fg.getFlowerName( 15 ) );
System.out.println( fg.maxFlower() );
Sample Output :
[01 rose, 01 poppy, 01 sunflower, 02 daisy]
3
-1
2
0
rose
out of range
02 daisy
[01 sunflower, 03 rose, 03 poppy, 02 gardenia, 06 daisy, 03 lily]
5
-1
6
0
gardenia
out of range
06 daisy
Press any key to continue...
 */
