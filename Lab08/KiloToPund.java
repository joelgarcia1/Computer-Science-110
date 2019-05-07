//Joel Garcia Valencia
//KiloToPound
//11A.M.

import java.util.Scanner;

public class KiloToPund
{
   public static void main (String []args)
   {
   Scanner get = new Scanner(System.in);
   
   System.out.print("Enter the amount of kilo: ");
   int kilo = get.nextInt();
    
   System.out.printf("%s %10s \n", "Kilograms", "Pounds ");
    
    
     for(int i= 1; i <= kilo ; i++)//rows
    {
       System.out.printf("%-11d %-10.2f \n", i, (i *2.2));
     }
   }  
}