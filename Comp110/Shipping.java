//Joel Garcia Valencia
//Shipping
//11Am

import java.util.Scanner;
public class Shipping 
{
   public static void main(String []args)
   {
   Scanner get = new Scanner(System.in);
   
    System.out.print("Enter the weight: ");
     double weight = get.nextDouble();

     if(weight < 0)
     {
     System.out.print("Invalid input");
     }
     else if(weight > 20)
     {
     System.out.print("The package can not be shipped");
     }
     else if(weight > 0 && weight <= 1)
     {
     System.out.print("The package costs $3.50"); 
     }
     else if(weight > 1 && weight <= 3)
     {
     System.out.print("The package costs $5.50"); 
     }
     else if(weight > 3 && weight <= 10)
     {
     System.out.print("The package costs $8.50"); 
     }
      else if(weight > 10 && weight <= 20)
     {
     System.out.print("The package costs $10.50"); 
     }

   }
}
