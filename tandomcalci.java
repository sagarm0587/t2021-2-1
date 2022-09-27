import java.util.Scanner;

public class tandomcalci 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("enter value of first number");
		double a = scan.nextInt();
		System.out.println("enter the value of second number");
		double b = scan.nextInt();
		System.out.println("Enter add for addition,sub for subtraction,mul for multiplication,div for division");
		String s1 =scan.next();
		
		if (s1.equalsIgnoreCase("add"))
		{
			System.out.println(a+b);
		}
		else if (s1.equalsIgnoreCase("sub"))
		{
			System.out.println(a-b);
		}
		else if (s1.equalsIgnoreCase("mul"))
		{
			System.out.println(a*b);
		}
		else if (s1.equalsIgnoreCase("div"))
		{
			System.out.println(a/b);
		}
		else
		{
			System.out.println("value are invalid");
		}
	
}

}
