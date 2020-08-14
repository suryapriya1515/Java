package pack1;
import java.util.*;
public class circle_area 
{
public static void main(String[]args)
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter Radius");
double r=obj.nextDouble();
double pi=3.14;
double area=pi*r*r;
System.out.println("Area of circle="+area);
}
}