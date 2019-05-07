//Joel Garcia Valencia
//Lab02
// 11A.M.

import java.util.Scanner;
public class Lab02
{
   public static void main(String[] args)
   {
   
   //input
   Scanner get = new Scanner(System.in);
     
     System.out.println("Enter the first x- axis: ");
     double x1 = get.nextDouble();
     
     System.out.println("Enter the first y-axis: ");
     double y1 = get.nextDouble();

      
     System.out.println("Enter the second x-axis: ");
     double x2 = get.nextDouble();
     
      System.out.println("Enter the second y-axis: ");
     double y2 = get.nextDouble();
     
     //formulas
     double d1 = (Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2));
     
     double d2 = Math.pow(d1, .5);
     
     //output
     System.out.print(d2);
   }
}