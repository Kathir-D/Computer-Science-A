import java.util.Arrays;

//make your LVader class here
public class Unit14b_LVader {

  private int[] stops;

  public Unit14b_LVader(int floors) {
    stops = new int[floors];
  }

  public boolean inRange(int floor) {
    return floor >= 0 && floor < stops.length;
  }

  public boolean incNumStops(int floor) {
    if (inRange(floor)) {
      stops[floor]++;
      return true;
    }
    return false;
  }

  public int numStops(int floor) {
    if (inRange(floor)) {
      return stops[floor];
    }
    return -1;
  }

  public int floorWithMostStops() {
    int maxStops = -1;
    int floor = -1;
    for (int i = 0; i < stops.length; i++) {
      if (stops[i] > maxStops) {
        maxStops = stops[i];
        floor = i;
      }
    }
    return floor;
  }

  public String toString() {
    return "" + Arrays.toString(stops);
  }


}




/*
Lab Goal : This lab was designed to teach you how to use an array, create a class, and search for values.
Lab Description :
For this problem, you need to make a LVader class.
The first and only instance variable will store the number of stops on each floor.
The LVader class will have 1 constructor that receives a number representing the number of floors.
The LVader class will have 5 methods.
The inRange method will receive a number to check to see if is a valid floor.
The incNumStops will increase the number of stops for a particular floor.
incNumStops will return false if it cannot increment the number of stops for the provided floor.
incNumStops must call inRange.
The numStops method will return the number of stops on that particular floor.
nnumStops will return -1 if the floor to check provided is invalid.
floorWithMostStops will return the floor with the max number of stops.
the ToString method will return all instance variables.
Sample Data :
LVader ela = new LVader( 7 );
System.out.println( ela.incNumStops( 9 ) );
System.out.println( ela.incNumStops( 4 ) );
System.out.println( ela );
ela.incNumStops( 6 );
ela.incNumStops( 3 );
System.out.println( ela );
System.out.println( ela.numStops( 8 ) );
System.out.println( ela.inRange( 11 ) );
ela.incNumStops( 0 );
ela.incNumStops( 1 );
ela.incNumStops( 6 );
ela.incNumStops( 6 );
ela.incNumStops( 5 );
ela.incNumStops( 5 );
ela.incNumStops( 0 );
ela.incNumStops( 1 );
System.out.println( ela );
System.out.println( ela.numStops( 6 ) );
System.out.println( ela.floorWithMostStops( ) );
Sample Output :
false
true
[0, 0, 0, 0, 1, 0, 0]
[0, 0, 0, 1, 1, 0, 1]
-1
false
[2, 2, 0, 1, 1, 2, 3]
3
6
 */