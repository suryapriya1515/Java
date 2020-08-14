package pack1;
import java.util.*;
public class Circle_circumference
{
public static void main(String[]args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter Radius");
double r=obj.nextDouble();
double pi=3.14;
double c=2*pi*r;
System.out.println("Circumference of circle="+c);
}
}