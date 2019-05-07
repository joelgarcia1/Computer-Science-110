//Joel Garcia Valencia
//DectoBinary
//llA.M.

import java.util.Scanner;
public class DecToBinary // binary is base 2
{
   public static void main(String[] args)
   {
   Scanner get = new Scanner(System.in);
   System.out.print("Enter the decimal: ");
   int dec = get.nextInt();
   int x = 0;
   int count = 0;
   String binary = "";
    
   while(dec != 0)
      {
      x = dec%2;
       if(x == 01)
       {
        count ++;
       }
       binary = binary + "" + x;
       dec = dec / 2;
      }
     System.out.println("Binary " + binary); 
   }
}