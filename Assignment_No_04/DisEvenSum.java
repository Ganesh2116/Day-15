//Q13.Wap take input first and last no and display all even numbers between them and find sum //and find sum an count.


import java.util.Scanner;

class DisEvenSum
{
	public static void main(String[] arge)	
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number start:");
	int num1 = sc.nextInt();
	
	System.out.println("Enter the number end");
	int num2 = sc.nextInt();
	
	int sum =0;
	int count =0;
	while(num2>= num1)
	{
	if(num1 % 2 == 0)
	{	
	sum = sum +num1;
	count++;
	}	
	num1++;
	}
	System.out.println("sum is all numbets"+sum);
	System.out.println("count is all numbets"+count);

	}
}