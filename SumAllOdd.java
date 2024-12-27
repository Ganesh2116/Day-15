// Q9. Write a program to find sum of all odd numbers between 1 to n


import java.util.Scanner;

class SumAllOdd
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the n value:");
	int num = sc.nextInt();
	
	int i=1;
	int sum = 0;
	
	while (num >= i)
	{
	if (i%2 != 0)
	{
	sum = sum +i;
	}
	i++;
	}
	System.out.println("the sum of all Odd numbers :"+sum);
	}
}