//Joel Garcia Valencia
//GrossPay
// 11A.M.

import java.util.Scanner;

public class GrossPay
{
   public static void main(String []args)
   {
     
   
      Scanner get = new Scanner(System.in);
   
      System.out.print("Enter Employee name: ");
      String name = get.nextLine();
   
      System.out.print("Enter hours worked: ");
      double hours = get.nextDouble();
   
      System.out.print("Enter hourly pay rate: $");
      double pr = get.nextDouble();
    
   double pr1 = pr;
    
   
      if(hours <= 40)
      {
         pr1 = hours*pr;
      }
      else 
      {
         if(hours <= 54)
         {
             pr1 = 40*pr + 1.5*(hours - 40)*pr;         
         } 
         else 
         {
            if(hours > 54)
            {
              pr1 = 40 * pr + 1.5*(hours - 40)*pr;
            }
         }
      }
      System.out.println( name + " worked for " + hours + " hrs  with the pay rate of $" + pr);
      System.out.printf("Enter pay rate:  $%.2f%n" , pr1);
   }
   
}
 

//Diana ramos regional