package approach5;

import java.util.Scanner;

public class Divide {
public static void main(String[] args) {
	System.out.println("Main starts");
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a value");
	int a=s.nextInt();
	System.out.println("Enter b value");
	int b=s.nextInt();
	int chance=0;
	while(true)
	{
		try
		{
			System.out.println(a/b);
			break;
		}
		catch (ArithmeticException e)
		{
			if(chance==3)
			{
				System.out.println("You Reached Max Limit..");
				break;
			}
				System.out.println("You have "+(3-chance)+" chances to enter valid data");
				System.out.println("Re-Enter the valid b value");
				b=s.nextInt();
				chance++;
			}
	}
	System.out.println("Main Ends");
}
}
