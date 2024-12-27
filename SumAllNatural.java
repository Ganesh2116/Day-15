//Q7. Write a program to find sum of all natural numbers between 1 to n.

import java.util.Scanner;

class  SumAllNatural
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the natural number  :");
	int num = sc.nextInt();
	
	int i =1;
	int sum =0;
	while (num >= i)
	{
	sum = sum+i; 
	i++;

	}
	System.out.println("The sum of all natural numbers :"+ sum);	
	}
}