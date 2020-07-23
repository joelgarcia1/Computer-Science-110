//Joel Garcia Valencia
//PalindromicPrime
//11AM

public class PalindromicPrime
{

   public static void main (String []args)
   {
   
   int count =0;
   int number = 2;
   int total = 94300;

   while(number <= total)
      {
      if(isPrime(number) && isPalindrome(number) )
         {
         System.out.println(number + " " );
         count++;
         }
         number++;
      }
      
//       System.out.println(313 + " is prime?" + isPrime(313));
//       System.out.println(314 + " is prime?" + isPrime(314));
//       System.out.println("Reverse of 313 is " + reverse(313));
//       System.out.println("Reverse of 1023 is " + reverse(1023));
//       System.out.println(313 + " is palindrome? " + isPalindrome(313));
//       System.out.println(314 + " is palindrome? " + isPalindrome(314));
   }
   // a prime number is a number where it can't be divided.
   public static boolean isPrime(int number)
   {
   for(int i = 2; i <= number/2; ++i)
      {
      if (number % i == 0)
        {
         return false;
        }
      }
   return true;
   }


//reverse: 
public static int reverse(int number)
{
   int x = 0;
   while(number != 0)
   {
   int reverseDigit = number % 10;
   x = x * 10 + reverseDigit;
   number = number / 10;
   }
return x;
  }
  
  public static boolean isPalindrome(int number)
  {
  return number == reverse(number);
  }
}
