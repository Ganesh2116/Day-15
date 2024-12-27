//Q15:Find the sum of even number of n digit number


import java.util.Scanner;

class SumEven
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int num = sc.nextInt();
	
	int i =1;
	int sum =0;

	while(num>= i)
	{
	if(i%2 == 0)
	{
	sum = sum +i;
	}
	i++;
	}
	System.out.println(sum);
	}	
}
 