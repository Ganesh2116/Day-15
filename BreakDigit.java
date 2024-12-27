// break digit

import java.util.Scanner;
class BreakDigit
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	int i=0;
	while(num !=0)
	{
	int rem = num%10;
	System.out.println(rem);
	num = num/10;
	}
	}	
}