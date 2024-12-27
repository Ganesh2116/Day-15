// break digit and print odd 


import java.util.Scanner;
class BreakDigitOdd
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	int i=0;
	int rem;
	while(num !=0)
	{
	rem = num%10;
	if (rem%2 != 0)
	{
	System.out.println(rem);
	}
	num = num/10;
	}
	}	
}