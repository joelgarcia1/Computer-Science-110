//Joel Garcia Valencia
//Money
//11AM

public class Money
{
   private int dollars;
   private int cents;
   
   
   public Money(int d, int c)
   {
   
   dollars = d;
   cents = c;
   
   }

   public void SetDollar(int d)
   {
   dollars = d;
   }

   public double getDollar()
   {
   return dollars;
   }

   public void SetCents(int c)
   {
   cents = c;
   }  

   public double getCents()
   {
   return cents;
   }

   public Money add(Money k)
   {
return k;
   }

   public String toString()
   {
   
   return "$" + dollars + ". " + cents;
   }
}