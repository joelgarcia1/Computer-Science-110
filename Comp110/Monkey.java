import java.util.*;


public class Monkey {
    public static void main(String[] args) {
        // TODO code application logic here
       // input a word (max 6 characters)
       Scanner in = new Scanner(System.in);
      String word;
     StringBuilder build = new StringBuilder();
      do 
      {
         System.out.println("Enter a word, max 6 chars");
         word = in.nextLine();
      
      } 
      while (word.length() > 6);

       long startTime = System.currentTimeMillis();
       StringBuilder s = new StringBuilder(word.length());
       build.append(word);
   	   // generate the initial String based on length of word    
   
 
       String e = "";
       

   while ( !e.equals(word))
       {
            
             // Generate the next word  by dropping first character and adding random char at end //sorting
             if(s.length() < word.length())
             {
             
             
            for(int i = 0; i < word.length(); ++i)
            { 
            
            char random = (generate());
            s.append(random);                      
            }
            
            }
           e = s.toString();
           s.deleteCharAt(0);
           char random = (generate());
           s.append(random);
            
            
            
          
            
               
        }
 
                  
        long endTime = System.currentTimeMillis();
        long time =  (endTime - startTime)/1000;
        System.out.println(time + " seconds");
    }
    
    // generate a random lowercase character
    public static char generate(){
    char c = ' ';
    c = (char)('a' + (int)(Math.random() * 26));
    return c;
     }
    }
