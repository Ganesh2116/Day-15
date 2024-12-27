// Q14.Wap to take input a no and print table

import java.util.Scanner;

class TableAnyNum
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number ");
	int num = sc.nextInt();
	
	int i =1;
	
	while ( 10 >= i)
	{
	int tab = num * i;
	System.out.println(tab);
	i++;
	}
	}


}