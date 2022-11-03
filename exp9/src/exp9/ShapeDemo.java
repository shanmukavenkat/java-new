package exp9;

abstract class Shape
{
int a=3,b=4;
abstract public void printarea();
}
class Rectangle extends Shape
{
public double arearect;
 public void printarea()
{
 arearect=a*b;
 System.out.println("The area of rectangle is:"+arearect);
}
}
class Triangle extends Shape
{
double areatri;
 
public void printarea()
{
 areatri=0.5*a*b;
 System.out.println("The area of triangle is:"+areatri);
}
}class Circle extends Shape
{
double areacircle;
 
public void printarea()
{
 areacircle=3.14*a*a;
 System.out.println("The area of circle is:"+areacircle);
}
}
public class ShapeDemo {
 public static void main(String[] args) {
 
 Rectangle r=new Rectangle();
 r.printarea();
 Triangle t=new Triangle();
 t.printarea();
 Circle r1=new Circle();
 r1.printarea(); 
 }
 
}