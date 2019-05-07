//Joel Garcia Valencia
//Fractions
//11 A.M.

import java.util.Scanner;

public class Fractions
{
   public static void main(String []args)
   {
   Scanner get = new Scanner(System.in);
   
   System.out.print("Enter a numerator: ");
   int numerator = get.nextInt();
   
   System.out.print("Enter a denomenator: ");
   
   int denominator = get.nextInt();
   
   if(numerator % denominator == 0) 
   {
   int a = numerator / denominator;
   System.out.print(numerator + " / " + denominator + " is an improper fraction and it can be reduced to " + a );
   }
   
      else if(numerator > denominator)
      {
      int a = numerator / denominator;
      int b = numerator % denominator;
      
      System.out.print(numerator + " / " + denominator + " is an improper fraction and its mixed fraction is " + a + " + " + b + " / " + denominator);
      }
      
    if(numerator < denominator)
      {
      System.out.print( numerator + " / " + denominator + " is a proper fraction");
      
      }
   }
}