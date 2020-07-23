//Joel Garcia Valencia
//MergeList
//11AM
import java.util.Scanner;
public class MergeList
{
   public static void main (String []args)
   {
   Scanner get = new Scanner(System.in);
   int[] list1 = generateList1();
   System.out.println();
   int[] list2 = generateList2();
   System.out.println();
      
      //List3
   System.out.println("  Results ");
   int[] list3 = Displaymerge(list1, list2);
   for(int i=0;i<list3.length;++i)
    System.out.print(list3[i]+"  ");
   

     


  
   }
   
   public static int[] generateList1()
   {
    //list1
    Scanner get = new Scanner(System.in);
 System.out.println("How many numbers int list 1: ");
   int num1 = get.nextInt();
   int[] list1 = new int[num1];
   
   int result1;
   for(int i = 0; i < list1.length; i++)
   {
   result1 = (int) (Math.random()*20 + 1);
   list1[i]=result1;
    System.out.print(result1 + " ");
   
    }
 return list1;
   }
   
   public static int[] generateList2()
   {
   //list2
   
   Scanner get = new Scanner(System.in);
  System.out.println("How many numbers int list 2: ");
      int num2 = get.nextInt();
      int[] list2 = new int[num2]; //initialized results
      int result2;
      for(int j = 0; j < list2.length; j++) //calling results
      {
   result2 = (int) (Math.random()*19 + 1);
   list2[j]=result2;
   
    System.out.print(result2 + " ");
    
      }
      
      return list2;
   }
   
       //Merging List1 and List2 = L3
   
   public static int[] Displaymerge(int[] list1, int[] list2)
   {
   
     
     int[] list3 = new int[list1.length + list2.length];

        int L1 = 0, L2 = 0, L3 = 0;

      while(L1 < list1.length && L2 < list2.length)
      {
      if(list1[L1] < list2[L2])
      {
      list3[L3] = list1[L1];
      L1++;
      
      }
   else 
     {
      list3[L3] = list2[L2];
     L2++;
     
      }
      L3++;
     }
   return list3;
   }

   
}