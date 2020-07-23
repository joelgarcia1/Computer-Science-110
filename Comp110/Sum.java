
import java.util.Scanner;
public class Sum
{
   public static void main(String []args)
   {
   Scanner get = new Scanner(System.in);
   System.out.print(" Enter numbers:");
   int Sum = get.nextInt();
   int oddSum = 0;
   int evenSum = 0;
   for(int i = 1; i <= Sum; i++)
		{
      
      System.out.println(i);
         
         if(i%2==1)
         {
         oddSum += i;
         }
         else if(i%2 ==0)
         {
         evenSum += i;
         }

 		System.out.println(" The Sum of Odd Numbers is up to " + oddSum);
      System.out.println(" The Sum of an Even Numbers is up to" + evenSum);
  
}
   }
}