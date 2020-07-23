//Joel Garcia Valencia
//HeadsTail
//11AM

import java.util.Scanner;
public class HeadsTail
{

   public static void main(String[] args) 
   {

    Scanner get = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 511: ");
    int number = get.nextInt();

    // Turn number into a binary string
    String binary = Integer.toBinaryString(number);
    binary = binary.format("%09d", Integer.parseInt(binary));
    for (int i = 1; i < 10; i++) 
      {
        if ('0' == binary.charAt(i - 1)) 
        {
            System.out.print("H ");
        } else 
        {
            System.out.print("T ");
        }
        //To make new lines
        if (i % 3 == 0) 
        {
            System.out.println();
        }
      }
   }
 }