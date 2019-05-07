//Joel Garcia Valencia
//Lab01_P02
//11 AM

import java.util.Scanner;
import java.text.DecimalFormat;

public class lab01_P02
{
	private static DecimalFormat df2 = new DecimalFormat(".##");


public static void main(String[]args)
   {
   double futureInvestmentValue = 0.0;


//input
      Scanner get = new Scanner(System.in);
     System.out.println("Enter the investmentAmount: ");
     double investmentAmount = get.nextDouble(); 
     
     System.out.println("Enter the monthlyInterestRate: ");
     double monthlyInterestRate = get.nextDouble(); 
   
     System.out.println("Enter the numberOfYears: ");
     double numberOfYears = get.nextDouble(); 
     
   //formula
    futureInvestmentValue = investmentAmount * Math.pow((1 + (monthlyInterestRate / 1200)), (numberOfYears * 12));
   
   //ouput
   
      //I made the calculation round 

   System.out.println("The accumaltive value is $" + df2.format(futureInvestmentValue));
   }

}
