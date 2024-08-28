//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Unit2_StarsAndStripes
{
   public Unit2_StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
      out.println("********************");;
   }

   public void printTwentyDashes()
   {
      out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
      out.println("\n\n");
   }
   
   public void printASmallBox()
   {
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
   }
 
   public void printABigBox()
   {
      printASmallBox();
      printASmallBox();
   }   
}