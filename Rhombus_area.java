package pack2;
import java.util.*;
public class Rhombus_area
{
	public static void main(String[]args)
	{
Scanner obj=new Scanner(System.in);
System.out.println("Enter value of the two diagonals of Rhombus:");
double d1=obj.nextDouble();
double d2=obj.nextDouble();
double a=(d1*d2)/2;
System.out.println("Area of the given Rhombus="+a);
	}
}
