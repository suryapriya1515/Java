package pack2;
import java.util.*;
public class Pentagon_area 
{
	public static void main(String[]args)
	{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the side of a Regular Pentagon:");
double s=obj.nextDouble();
double a=(Math.sqrt(5*(5+(2*(Math.sqrt(5)))))*s*s)/4;
System.out.println("Area of the given Rhombus="+a);
	}
}
