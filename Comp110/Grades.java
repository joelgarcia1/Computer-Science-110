//Joel Garcia Valencia
// Grades
//11AM

import java.util.Scanner;
public class Grades
{
   public static void main (String [] args)
   {
  Scanner get = new Scanner(System.in);
  
  System.out.print("Enter the number of students: ");
  int students = get.nextInt();
   int[] Scores = new int[students];
   
   
   System.out.print("Enter 4 scores: ");
    
   for(int i= 0; i < Scores.length; ++i)
      {
      Scores[i] = get.nextInt();
      }  
     int best[] = bestScores(Scores);
      System.out.print(getScores(Scores, best ));
      System.out.print(bestScores(Scores));

   }
   
   public static char getScores(int[] scores, int[] best)//list
   {
   for(int i = 0; i < scores.length; i++)//loops of students
      {
      if((best[i] - 10) >= best[i])
      {
      System.out.println("Student " + i + " score is " + best[i] + " and grade is A");
      }
      else if(( best[i] - 20) >= best[i])
      {
      System.out.println("Student " + i + " score is " + best[i] + " and grade is B");
      }
      else if((best[i] - 30) >= best[i])
      {
      System.out.println("Student " + i + " score is " + best[i] + " and grade is C);");
      }
      else if((best[i] - 40) >= best[i])
      {
      System.out.println("Student " + i + " score is " + best[i] + " and grade is D");
      }
      else 
      System.out.println("Student " + i + " score is " + best[i] + " and grade is F");
      } 
     
     char g = ' ';
     return g;
   }
   
   public static int[] bestScores(int[] scores)
   {
   int best = scores[0]; 
  
      for (int i = 1; i < scores.length; i++)
      {
            if (scores[i] > best) ;
            best = scores[i];
       }
     return scores;
   }
   
}
   
   

