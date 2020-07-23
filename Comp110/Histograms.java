//Joel Garcia Valencia
//Histograms
//11AM

import java.util.Scanner;

public class Histograms
{
   public static void main (String[] args)
   {
   System.out.println("Generated List");
   System.out.println(" ");
   int[] numbers = CreateNumbers();
   displayNumber(numbers);
   
   System.out.println();
   System.out.println("The frequency Distribution: ");
   Displayfrequency(numbers);
   
   System.out.println();    
   System.out.println("The histogram chart");
   histogramDisplay(numbers);
    }
    
    public static int[] CreateNumbers()
    {
    int [] list = new int[100]; //set it to 100 "blocks"
   for(int i = 0; i < list.length; ++i)
      {
      list[i] = (int)(Math.random()*100 + 1);
      }
      return list;
    }
    
 
    public static void displayNumber(int[] list)
    {
    for(int i = 0; i <list.length; ++i)
      {
      if((i+1)%10 == 0)
         {
         System.out.println(list[i] + " "); 
         }
         else 
         {
         System.out.print(list[i] + " "); 
         }
      }

    }
   
   
   public static int[] frequency(int[] list)
   {
   int[] counts = new int[10];
   for(int i = 0; i < list.length; i++)
      {
      counts[list[i]]++;
      }
      return counts;
   }
   
   public static void Displayfrequency(int[] count)
   {
   for(int i = 0; i < 10; i++)
      {

      
      System.out.println("range[" + i + "]" + " " + count[i]);

      
      }
   }
   public static int[] histogram(int[] lists)
   { 
   int[] count = new int[10];
   for(int j = 0; j < 10; j++)
      {
      count[lists[j]]++;
      }
      return count;

   }
   public static void histogramDisplay(int [] count)
   {
  
    int n = 0;
    for(int i=0;i<10;++i)
    {
        System.out.print((i*10+1) +"-"+(i*10+10)+":"+"\t");

        for(int j=1; j<count[i];++j)  
            System.out.print("*");


        System.out.println();   
    }
   }
   
}