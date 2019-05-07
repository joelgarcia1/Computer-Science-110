//Joel Garcia Valencia
//PerfectNumber
//11Am


public class PerfectNumber
{
   public static void main(String [] args)
  {
   int minimum = 1;
   int maximum = 10000;

for (minimum = 1; minimum <= maximum; minimum++)
 {
    int sum = 0;
    int number = 1;
    for (number = 1; number < minimum; number++) 
    {
        int a = minimum % number;

        if (a == 0)
        {
            sum += number;
        }
    } 
    if (sum == minimum)
    {           
        System.out.println(sum);
    }  
    }       
   } 
}         