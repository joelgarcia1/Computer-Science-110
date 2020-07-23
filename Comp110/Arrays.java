import java.util.Scanner;

public class Arrays
{
   public static void main (String [] args)
   {
/*
   int[] value = new int[5];
   value[0]= 1;
   value[1] = 22;
   value[2]= 32;
   value[3] = 134;
   value[4] = 14; 
   
     System.out.print(value[1]);
 */
     
  //Another way of using arrays, you can do:
     
 /*   int [] value = {1,22,32,132,12};
    System.out.print(value[2]);
 */   
    
  //now enter a number to get the array
  
   int [] value = {21,32, 53, 123, 12, 53, 10};
   int [] num = new int[10];
      Scanner get = new Scanner(System.in);
      for(int i = 0; i < 1;++i) //i <1 because its how many time you enter a number and the last one gets printed
         {
      System.out.print("Enter the value: ");
      num[i] = get.nextInt();
      System.out.print(value[num[i]]);
         } 
   }
}