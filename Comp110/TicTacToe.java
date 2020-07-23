import java.util.*;
public class TicTacToe
{
   static Scanner in = new Scanner(System.in);
   public static void main(String[] args)
   {
  	Scanner in = new Scanner(System.in);
  	char[][] board = new char[3][3];
  	for(int i = 0;i < 3; i++)
     	for(int j = 0;j < 3; ++j)
        	board[i][j]= ' ';
  	while (true)
  	{
     	computerPlay(board);
     	displayBoard(board);
     	if(checkWin(board,'X') == true)
     	{
        	System.out.println("Computer Wins");
        	System.exit(0);
     	}
     	if(checkTie(board))
     	{
        	System.out.println("Tie game");
        	System.exit(0);
     	}
     	playerPlays(board);
     	displayBoard(board);
     	if(checkWin(board,'O') == true)
    	{
        	System.out.println("Player Wins");
        	System.exit(0);
     	}
     	if(checkTie(board))
     	{
        	System.out.println("Tie game");
        	System.exit(0);
     	}
  	}
     	
   }
  
 
   // Prompt the user for row & column index. Continue asking 
   // until an empty cell is selected. set the cell to 'O'
   public static void playerPlays(char[][] board)
   {
   while(true){
   Scanner in = new Scanner(System.in);
    System.out.println("Enter row and col ");
    
   int row = in.nextInt();
   int col = in.nextInt();
   if (board[row][col] == 'O' && board[row][col] == 'X')
   {
   System.out.println("filled");
   }
   else 
   {
   board[row][col] = 'O';
   break;
   }
   }
          	
   }

   // Check by row, column, and diagonals
    public static boolean checkWin(char[][] board,char ch)
   { 
   
     // top row
	if((board[0][0] == ch) && (board[0][1] == ch) && board[0][2] == ch)
	  {
      return true;
      }
	// middle row
	if((board[1][0] == ch) && (board[1][1] == ch) && (board[1][2] == ch))
	    {
       return true;
       }
	// bottom row
	if((board[2][0] == ch) && (board[2][1] == ch) && (board[2][2] == ch))
	   {
      return true;
      }
      
      //verticals
      if((board[0][0] == ch) && (board[1][0] == ch) && (board[2][0] == ch))
	   {
      return true;
      }
if((board[0][1] == ch) && (board[1][1] == ch) && (board[2][1] == ch))
	   {
      return true;
      }
if((board[0][2] == ch) && (board[1][2] == ch) && (board[2][2] == ch))
	   {
      return true;
      }

	//Diagonals

// left diagonal
	if((board[0][0] == ch) && (board[1][1] == ch) && (board[2][2] == ch))
	    {
       return true;
       }
	// right diagonal
	if((board[0][2] == ch) && (board[1][1] == ch) && (board[2][0] == ch))
       {
       return true;
       } 
   return false;
    }
 	
   // check for tie. If there no  empty cells, then it is a tie
    public static boolean checkTie(char[][] board)
    {
    if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' && board[1][0] == 'O'  && board[1][1]  == 'O' && board[1][2]  == 'O' && board[2][0]  == 'O' &&
    board[2][1] == 'O'  && board[2][2] == 'O' )
    {
   return true;
   }
   if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' && board[1][0] == 'X'  && board[1][1]  == 'X' && board[1][2]  == 'X' && board[2][0]  == 'X' &&
    board[2][1] == 'X'  && board[2][2] == 'X' )
    {
   return false;
   }

return false;
    }

 	
	// Display the board
   public static void displayBoard(char[][] board)
   {
        String bar = "===========";

        System.out.println(bar);
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(bar);
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(bar);
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println(bar);
        System.out.println("");

  }
  
  // Continue generating random values for row and col until an 
  // empty cell selected. Set the cell to 'X'
    public static void computerPlay(char[][]board)  
   {
  	while(true)
{
int row = (int)(Math.random()*3);
int col = (int)(Math.random()*3);

	if(board[row][col] == ' ')
   {
   board[row][col] = 'X';
   break;
   }
   }     
      }
}
 

