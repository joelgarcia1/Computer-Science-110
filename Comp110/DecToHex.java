//Joel Garcia Valencia
//DecToHex
//11A.M.

import java.util.Scanner;
public class DecToHex
{
   public static void main(String [] args)
   {
   Scanner get = new Scanner(System.in);
   System.out.print("Enter the decimal value: ");
   int numbers = get.nextInt();
  
    char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
              'A', 'B', 'C', 'D', 'E', 'F'};
     int remain = 0;
     String string = " " ; 
     if(numbers >0 && numbers < 16)
     {
   
       remain = numbers % 16; 
       string = hex[remain]+string; 
       numbers = numbers / 16;
       System.out.println("The hex value is: "+ string);
     }
     

   }
}