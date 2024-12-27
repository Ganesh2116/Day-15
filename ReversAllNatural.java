//Q4. Write a program to print all natural numbers in reverse (from n to 1). - using 
//     while loop


import java.util.Scanner;

class  ReversAllNatural
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the natural number  :");
	int num = sc.nextInt();
	
	int i =1;
	
	while (num >= i)
	{
	System.out.println(num);
	num--;

	}
		
	}
}