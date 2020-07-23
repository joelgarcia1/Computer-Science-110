public class matrix
{
   public static void main(String []args)
   {
   
//    //beginning
//    int[][] matrix = new int[5][5];
//    matrix[2][1] = 7;
//    for(int i = 0; i < matrix.length; i++)
//       {
//    for(int j = 0; j < matrix[i].length; j++)
//       {
// 
//    System.out.print( matrix[i][j] + " " );
//       }
//    System.out.println();    
//       }

      //random arrays and swap
      int[][] matrix = new int[5][5];
      matrix[2][1] = 4;
      matrix[3][2] = 5;
      int temp;
      for(int i = 0; i < matrix.length; i++)
         {
         for(int j = 0; j < matrix[i].length; j++)
         {
          int i1 = (int) (Math.random()* matrix.length);
         int j1 = (int) (Math.random() * matrix[i].length);
         //swap matrix[i][j] to matrix [i1][j1]
        temp = matrix[i][j];
         matrix[i][j] = matrix[i1][j1];
         matrix[i1][j1] = temp;
         System.out.print(temp + " " );
         }
         System.out.println();
         }
      
  
   }
}