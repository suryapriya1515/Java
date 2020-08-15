package pack2;
import java.util.*;
public class Switch_alternate 
{
	public static void main(String[]args)
	{
Scanner obj=new Scanner(System.in);
System.out.println("Enter any two numbers:");
float a=obj.nextFloat();
float b=obj.nextFloat();
System.out.println("Enter any operator(+,-,*,/):");
String ch=obj.next();
switch(ch)
{
case "+":System.out.println("Addition="+(a+b));
break;
case "-":System.out.println("Subtraction="+(a-b));
break;
case "*":System.out.println("Multiplication="+(a*b));
break;
case "/":System.out.println("Division="+(a/b));
break;
default:System.out.println("Invalid choice");
}
}
}