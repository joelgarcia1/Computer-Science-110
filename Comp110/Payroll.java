//Joel Garcia Valencia
//Payroll
//11am

import java.util.Scanner;
public class Payroll
{
   public static void main(String [] args)
   {
   Scanner get = new Scanner(System.in);
   
  System.out.print("Enter employee's name: ");
  String name = get.nextLine();
  
  System.out.print("Enter number of hours worked in a week: ");
  double hours = get.nextDouble();
  
  System.out.print("Enter hourly pay rate: $");
  double hourlyPayRate = get.nextDouble();
  
  System.out.print("Enter federal tax withholding rate: ");
  double federalTax = get.nextDouble();
  
  System.out.print("Enter state tax withholding rate: ");
  double stateTax = get.nextDouble();
   
   
   double payRate1 = hourlyPayRate;
   double grossPay = hours * hourlyPayRate;
   double federalPercentages = federalTax * 100; 
   double federalTax2 = grossPay * federalTax;
   
   double stateTaxRate = grossPay * stateTax;
   double statePercentages = stateTax * 100;
   double totalDeduction = stateTaxRate + federalTax2;
   
   double netPay = (grossPay - totalDeduction)-.001;
   //output
   System.out.println("Employee name: " + name );
   System.out.println("Hours worked: " + hours);
   System.out.println("Pay rate: $" + payRate1);
   System.out.println("Gross Pay: $" + grossPay);
   
   System.out.println("Deduction: ");
   System.out.println("    Federal withholding (" + federalPercentages + "%): $" +  federalTax2);
   System.out.println("    State withholding(" + statePercentages + "%): $" + stateTaxRate);
   System.out.printf("Total deduction : $ %.2f%n",  totalDeduction);//can't round
   System.out.printf("Net pay: $ %.2f%n", netPay);
   }
}