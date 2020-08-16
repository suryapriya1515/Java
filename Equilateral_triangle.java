package pack2;
import java.util.*;
public class Equilateral_triangle
{
public static void main(String[]args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a side of the equilateral triangle:");
	double s=obj.nextDouble();
	double a=(Math.sqrt(3)/4)*s*s;
		System.out.println("Area of the given triangle="+a);
}
}
