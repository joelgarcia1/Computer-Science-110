//Joel Garcia Valencia
//Equation
//11AM
import java.util.Scanner;
public class Equation
{
   public static void main(String []args)
  {
   
   //input
   Scanner get = new Scanner(System.in);
   
   System.out.print("Enter a :");
   double a = get.nextDouble();
   
   System.out.print("Enter b :");
   double b = get.nextDouble();
   
   System.out.print("Enter c :");
   double c = get.nextDouble();
   
  //formula
  double result = b * b - 4.0 * a * c;
  
  double equation1 = (-b + Math.pow(result, 0.5))/(2.0*a);
  double equation2 = (-b - Math.pow(result, 0.5))/(2.0*a);
  
  //output
   if(result > 0)
   {
      System.out.println("The equation has two roots " + equation1 + " and " + equation2 );
   }
   else if(result == 0)
   {
   
   System.out.println("The equation has one root " + equation1);
   }
   
   else if(result < 0)
   {
   System.out.println("The equation has no real roots");
   }
  }
}