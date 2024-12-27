//Q5. Write a program to print all odd numbers between 1 to 100. - using while loop.


import java.util.Scanner;

class OddNum
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number:");	
	int num = sc.nextInt();
	
	int i=1;
	
	while(num>=i)
	{

	if (i%2 != 0)
	System.out.println(i);
	
	i++;
	}
	
	}
}