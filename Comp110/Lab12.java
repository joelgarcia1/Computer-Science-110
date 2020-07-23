//Joel Garcia Valencia
//Lab12
//11 AM

import java.util.Scanner;
 
public class Lab12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter a credit card number as a long integer: ");
    long number = input.nextLong();
   
//    //test
//    System.out.println(sumOfDoubleEvenPlace( number));
//    System.out.println(sumOfOddPlace( number));
//    System.out.println(" ");
//  //   System.out.println(getSize( number )); get size work
//    System.out.println(sumOfDoubleEvenPlace( number) + sumOfOddPlace( number));
//    //<-Test

    if (isValid(number))
      System.out.println(number + " is valid");
    else
      System.out.println(number + " is invalid");
      
  }
 
  /** Return true if the card number is valid */
  public static boolean isValid(long number) {
    return  (getSize(number) >= 13) && (getSize(number) <= 16) &&
        (prefixMatched(number, 4) || prefixMatched(number, 5) ||
        prefixMatched(number, 6) || prefixMatched(number, 37)) &&
       (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
  }
 
  /** Get the result from Step 2 */
  
  //you muliply everything by 2 and add it all up
  public static int sumOfDoubleEvenPlace(long number) {
    int result = 0;
        long numbers = 0;

        while (number > 0) {
            numbers = number % 100;
            result += getDigit((int) (numbers / 10) * 2);
            number = number / 100;
        }
    // Implementation left as exercise
       
    return result;
  }
 
  

/** Return this number if it is a single digit, otherwise, return
   * the sum of the two digits */
   
   //if the number is > 9 
  public static int getDigit(int number)
   {
       int n = 0;
       int result = 0;
	    if(number > 9)
    {
  n = (int) ((number % 10) + (number/10));
    }
    else 
    {
    return number;
    }
    
    

     result = result + n;
      
    // Implementation left as exercise

     return result;

  }
 
  /** Return sum of odd place digits in number */
  public static int sumOfOddPlace(long number) {
  
    int result = 0;
    
    while(number != 0)
    {
    int n = (int)(number%10);
      result = result + n;
      number = number/100;
    }
  
    // Implementation left as exercise
   
    return result;
  }
 
  /** Return true if the digit d is a prefix for number */
  public static boolean prefixMatched(long number, int d) {
    return getPrefix(number, getSize(d)) == d;
  }
 
  /** Return the number of digits in d between 13 and 16 */
  public static int getSize(long d) 
  {
     int numberOfDigits = 0;

        while (d > 0) 
        {
            d = d / 10;
            numberOfDigits++;
        }

   
    // Implementation left as exercise
   
    return numberOfDigits;
  }
 
  /** Return the first k number of digits from number. If the number
   * of digits in number is less than k, return number. */
  public static long getPrefix(long number, int k)
   {
    
    long result = number;

         if (getSize(number) > k) 
         { 
            String num = number + ""; 
            return Long.parseLong(num.substring(0, k)); 
        } 
        return result; 
   }
}
