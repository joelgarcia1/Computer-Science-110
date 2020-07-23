//Joel Garcia Valencia
//Lab01_P01
//11 A.M.

import java.util.Scanner;

public class Lab01_P01
{
public static void main(String []args)
   {
   
   double Yard = 0.0;
   double House = 0.0;
   double GrassS = 0.0;
   double GrassM = 0.0;
   double A = 0.0;
   
   //inputs
     Scanner get = new Scanner(System.in);
     System.out.println("Enter the length of the yard: ");
     double LengthY = get.nextDouble(); 
     
     System.out.println("Enter the width of the yard: ");
     double WidthY = get.nextDouble(); 
   
     System.out.println("Enter the length of the yard: ");
     double LengthH = get.nextDouble(); 
     
     System.out.println("Enter the length of the yard: ");
     double WidthH = get.nextDouble();
     
     //formulas
     
     Yard = LengthY * WidthH;
     House = LengthH * WidthH;
     
     //get the Area
      A = Yard - House;
      //Grass in seconds
      GrassS = A/2;
      //Grass in minutes
      GrassM = GrassS/60;
      
      //output
      System.out.printf("It takes %.2f%n ", GrassM);System.out.print("minutes to cut the grass");
      
        }
}