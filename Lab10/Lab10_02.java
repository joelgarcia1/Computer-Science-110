//Joel Garcia Valencia
//Lab10_02
//11 A.m.

import java.util.Scanner;

public class Lab10_02
{

   public static void main(String [] args)
   {
   Scanner get = new Scanner(System.in);
   System.out.print("Enter a String: ");
   String str = get.nextLine();
   
    System.out.print("Enter a Character: ");
   char a = get.next().charAt(0);
   
   int count = count(str, a);
   System.out.print("returns " + count(str, a) + " " + a + " from the string" );
   }
   
   //count() method
public static int count(String str, char a) 
 {
    if (str.length() == 0) 
    {
      return 0;
    }
    int count = 0;
    if (str.charAt(0) == a) 
    {
      count++;
    }
    return count + count(str.substring(1), a);
  }
}