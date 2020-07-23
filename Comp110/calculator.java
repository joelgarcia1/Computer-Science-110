public class calculator
{
   public static void main(String [] args)
   {

   if(args.length != 3)
      {
   System.out.println("Not enough arguments");
   System.exit(0);
      }
      int result = 0;
      int value1;
      int value2;
      
      switch (args[1])
      {
      case "+": 
            value1=Integer.parseInt(args[0]);
            value2=Integer.parseInt(args[2]);
            result = value1+value2;
            break;
         case "-": 
            value1=Integer.parseInt(args[0]);
            value2=Integer.parseInt(args[2]);
            result = value1-value2;
            break;
         case "/": 
            value1=Integer.parseInt(args[0]);
            value2=Integer.parseInt(args[2]);
            result = value1/value2;
            break;
         case "%": 
            value1=Integer.parseInt(args[0]);
            value2=Integer.parseInt(args[2]);
            result = value1%value2;
            break;
         default:
            System.out.println("Illegal Operation");
            System.exit(1);
      }
      System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+ result);
   
   

      }
}