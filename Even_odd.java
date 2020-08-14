package pack2;
import java.util.*;
public class Even_odd 
{
public static void main(String[]args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number 'a':");
	int a=obj.nextInt();
	if(a%2==0)
		System.out.println("a is an Even number where a="+a);
	else
		System.out.println("a is an odd number where a="+a);
}
}
