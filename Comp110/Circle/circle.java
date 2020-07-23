public class circle
{
   private double radius;
   private static int numofobject;
   
   public circle()
   {
   radius = 0.0;
   numofobject ++;
   }
   
   public circle(double r)
   {
   radius = r;
   numofobject ++;
   }
   
   public double getRadius()
   {
   return radius;
   }
   
   public void setRadius(double r)
   {
   radius = r;
   }
   
   public static int getnumofobjects()
   {
   return numofobject;
   }
   
   public double getArea()
   {
   return radius * 3.14;
   }
   
}