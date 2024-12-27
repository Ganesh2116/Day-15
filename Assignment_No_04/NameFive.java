// Q11.Wap enter your name and print it five times.

import java.util.Scanner;

class NameFive
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter name:");
	String name = sc.nextLine();
	
	int i=1;
	while(5>=i)
	{
	System.out.println(name);
	i++;
	}

	}
}
