//Joel Garcia Valencia
//MidTerm
//11AM

import java.util.Scanner;
public class MidTerm
{
   public static void main(String []args)
   {

   double numerator = 0.0;
   double denom = 0.0;
   double factor = 0.0;

       for(int i = 1 ; i <= 100; i++)
      {
    denom = (double)((i+1.0)/(i+(i+1.0)));
    
      }

System.out.print(denom);
  }
}