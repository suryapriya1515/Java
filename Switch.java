package pack2;
import java.util.*;
public class Switch 
{
	public static void main(String[]args)
	{
Scanner obj=new Scanner(System.in);
System.out.println("Enter any two numbers:");
float a=obj.nextFloat();
float b=obj.nextFloat();
System.out.println("Enter choice:"+"\n 1.Addition"+"\n 2.Subtraction"+"\n 3.Multiplication"+"\n 4.Division");
int ch=obj.nextInt();
switch(ch)
{
case 1:System.out.println("Addition="+(a+b));
break;
case 2:System.out.println("Subtraction="+(a-b));
break;
case 3:System.out.println("Multiplication="+(a*b));
break;
case 4:System.out.println("Division="+(a/b));
break;
default:System.out.println("Invalid choice");
}
}
}
