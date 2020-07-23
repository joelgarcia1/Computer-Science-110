//Joel Garcia Valencia
//Money
//11AM

public class Money
{
   private int dollars;
   private int cents;
   
   public Money()
   {
   dollars = 0;
   cents = 0;
   }
   public Money(int d, int c)
   {
   
   dollars = d + c / 100;
   cents = c%100;
   
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

   public Money add(Money m)
   {
   int c1 = this.dollars * 100 +this.cents;
   int c2 = m.dollars * 100 + m.cents;
   int sum = c1 + c2; 
   return new Money(sum/100, sum%100);
   }

public Money subtract(Money m)
   {
   int c1 = this.dollars * 100 +this.cents;
   int c2 = m.dollars * 100 + m.cents;
   if(c1 > c2)
   {
   int sum = c1 - c2;
   return new Money(sum/100, sum%100);

   }
   else 
   {
   return null;
   } 
      }

   public String toString()
   {
   
   return "$" + dollars + "." + cents + "¢";
   }
}