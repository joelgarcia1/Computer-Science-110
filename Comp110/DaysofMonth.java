//Joel Garcia Valencia
//DaysofMonth
//11AM

import java.util.Scanner;
public class DaysofMonth
{
   public static void main(String []args)
   {
   Scanner get = new Scanner(System.in);
     
     int numberofDays = 0;
     String MonthName = ""; 
     System.out.print("Enter the Month: ");
     int month = get.nextInt();
     
     System.out.print("Enter the Year: ");
     int year = get.nextInt();
     
     switch(month)
     {
      case 1: 
      MonthName = "January";
      numberofDays = 31;
      break;
      
      case 2:MonthName = "February";
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
         {
        numberofDays = 29;
         }
        else 
         {
         numberofDays = 28;
         }
        break;
        
        case 3:
        MonthName = "March";
        numberofDays = 31;
        break;
         
        case 4:
        MonthName = "April";
        numberofDays = 30;
        break;
       case 5:
        MonthName = "May";
        numberofDays = 31;
        break;
       case 6:
        MonthName = "June";
        numberofDays = 30;
        break;
       case 7:
        MonthName = "July";
        numberofDays = 31;
        break;
       case 8:
        MonthName = "August";
        numberofDays = 31;
        break;
       case 9:
        MonthName = "September";
        numberofDays = 30;
        break;
       case 10:
        MonthName = "October";
        numberofDays = 31;
        break;
       case 11:
        MonthName = "November";
        numberofDays = 30;
        break;
       case 12:
        MonthName = "December";
        numberofDays = 31;
     }
     System.out.print(MonthName + " " + year + " had " + numberofDays + " days\n");
   }
}