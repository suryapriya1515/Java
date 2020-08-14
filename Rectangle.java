package pack1;
import java.util.*;
public class Rectangle 
{
public static void main(String[]args)
{
	Scanner  obj=new Scanner(System.in);
	System.out.println("Enter length");
	double l=obj.nextDouble();
	System.out.println("Enter breadth");
	double b=obj.nextDouble();
	double a=l*b;
	System.out.println("Area of the Rectangle="+a);
}
}