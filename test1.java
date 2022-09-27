import java.util.Scanner;

public class test1 
{ 
	public static void main(String[] args) 
	{
		Scanner scan = new  Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		if (num%2==0)
		{
		for(int i=1;i<=num-1;i++)
		
		{
			System.out.print( i*2-1);
		}
		}
		
		else
		{
			for(int i=1;i<=num;i++)
				
			{
				System.out.print( i*2-1);
			}
		}
		
	}
	}


