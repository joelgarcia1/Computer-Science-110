//Joel Garcia Valencia
//Lab10_01
//11 A.m.

public class Lab10_01
{
   public static void main(String []args)
   {
   System.out.println("Sum of digits of 1024 is " +sumDigits(1024));
   System.out.println("Sum of digits of 236 is " +sumDigits(236));
   }
   
   //sumDigits() method
   public static int sumDigits(int n)
   {
   int sum = 0;
   while(n > 0)
      {
   sum = sum + n % 10;
   n = n/10;
      }
   return sum;
   }
}