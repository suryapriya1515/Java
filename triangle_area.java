package pack1;
import java.util.*;
public class triangle_area 
{
public static void main(String[]args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter height of the triangle");
	double h=obj.nextDouble();
	System.out.println("Enter the base of the triangle");
	double b=obj.nextDouble();
	double area=(b*h)/2;
	System.out.println("Area of the triangle="+area);
}
}
