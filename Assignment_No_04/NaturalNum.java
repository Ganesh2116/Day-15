// Q3. Write a program to print all natural numbers from 1 to n. - using while loop

import java.util.Scanner;

class NaturalNum
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number ");
	int num = sc.nextInt();
	
	int i=1;
	while(num >= i)
	{
	System.out.println(i);
	i++;
	}
	}
}
