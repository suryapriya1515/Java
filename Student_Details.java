package pack2;
import java.util.*;
public class Student_Details
{
public static void main(String[]args)
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Sno:");
	int sno=obj.nextInt();
	System.out.println("Enter Sname:");
	String sname=obj.next();
	System.out.println("Enter age:");
	byte age=obj.nextByte();
	System.out.println("Enter fees:");
	double fees=obj.nextDouble();
	System.out.println("The Details of the Student are:");
	System.out.println("\n Sno:"+sno+"\n Sname:"+sname+"\n Age:"+age+"\n Fees:"+fees);
}
}
