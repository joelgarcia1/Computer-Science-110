//Joel Garcia Valencia
//Count
//11AM

public class Count
{
   public static void main(String []args)
   {
   int [] numbers =  createNumbers(); //make method creatNum
   displayArray(numbers);//create a method that displays the numbers
   int [] count = countNumbers(numbers);//make a method that counts the numbers
   displayCount(numbers);//create a method that displays the count result
   }
   

   public static int[] createNumbers()
   {
   int [] list = new int[100]; //set it to 100 "blocks"
   for(int i = 0; i < list.length; ++i)
      {
      list[i] = (int)(Math.random()*10);
      }
      return list;
   }
   
   public static void displayArray(int[] list)
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
   
   
   public static int[] countNumbers(int[] list)
   {
   int [] count = new int[100];
   for(int i = 0; i < list.length; ++i)
      {
      count[i]++;
      }
      return count;
   }
   
   public static void displayCount(int[] count)
   {
   for(int i = 0; i < count.length; ++i)
      {
       
       System.out.println((i+ ": "+ count[i]));//displays 10 per line
      
      }
   }
}