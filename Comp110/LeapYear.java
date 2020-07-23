//Joel Garcia Valencia
//LeapYear
//11A.M.

import java.util.Scanner;

public class LeapYear
{
   public static void main(String [] args)
   {
      int leapYear = 2000;
      int endYear = 2100;
      int j= 0;
      for(leapYear = 2000; leapYear < endYear; leapYear++)
        {
           if ((leapYear % 4 == 0) && leapYear % 100 != 0)
              {
               System.out.print(leapYear + " ");
               j++;
               if (j % 10 == 0)
                 {
                 System.out.println("\n");
                 j = 0;
                 }
              }
         }
   }  
}