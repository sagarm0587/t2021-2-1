import java.util.Scanner;

public class program4 
{
public static void main(String[] args) 
{
	Scanner scan = new Scanner(System.in);
	int arr[]= new int[9];
	for (int i=0;i<=arr.length-1;i++)
	{
		arr[i]=i+1;
	}
	System.out.println("enter the number of integer");
	int num=scan.nextInt();
	int arr1[]=new int[num];
	System.out.println("enter the numbers");
	for(int i=0;i<=arr1.length-1;i++)
	{
		arr1[i]=scan.nextInt();
	}
	for(int j=0;j<=arr.length-1;j++)
			{
		int count=0;
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]%arr[j]==0)
{
	count++;
}
		}
		System.out.print(arr[j]+":"+count+" ");
		
			}
	
}
}
