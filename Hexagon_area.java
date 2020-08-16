package pack2;
import java.util.Scanner;
public class Hexagon_area
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a side of the Regular Hexagon:");
		double s=obj.nextDouble();
		double a=(3*(Math.sqrt(3))/2)*s*s;
			System.out.println("Area of the given hexagon="+a);
}
}
