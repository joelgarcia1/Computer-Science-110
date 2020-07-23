//Joel Garica Valencia
//TestMoney
//11AM

public class TestMoney
{

   public static void main(String []args)
   {
   Money[] list = new Money[10];
   Money sum = new Money();   
   
   //Test

//     Money m1 = new Money(5, 95);  
//     Money m2 = new Money(10, 45);
//    Money sum = m1.add(m2);
//     Money sub = m2.subtract(m1);
//    
//    //print
//    System.out.println();
//    System.out.println(m1 + " + " + m2 + " = " + sum);
//    System.out.println();
//     System.out.println(m1 + " - " + m2 + sub);
  
    for(int i = 0; i < list.length; i++)
    {
    list[i] =  new Money((int) (Math.random() * 30 + 1), (int) (Math.random() * 99));
   
    sum = sum.add(list[i]);
    System.out.println(list[i]);
    }
    
    System.out.println("total of money = " + sum);
   }
}
