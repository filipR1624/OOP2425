package lab5;

public class MyFirstCircle
{
public static void main (String args[])
{
Point myPoint = new Point(10, 20);
Circle myCircle = new Circle(15, 30, 5);
// I added the \n in the prints below, beacuse of formating
System.out.println("Point details : \n" + 
myPoint);
System.out.println("Circle details: \n" + 
myCircle);
}
}