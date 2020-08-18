package pack3;
import java.util.*;
public class Array2
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size:");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter "+ n +" array values:");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("values \t Index");
	for(int i=0;i<n;i++)
	{
		if (a[i]%2==0)
		{
			System.out.println(a[i]+"\t"+i);
		}
	}
}
}
