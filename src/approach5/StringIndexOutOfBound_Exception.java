package approach5;

import java.util.Scanner;

public class StringIndexOutOfBound_Exception 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s="Java";
		System.out.println("Main Starts");
		System.out.println("Given String: "+s);
		System.out.println("Enter Index of Char");
		int i=sc.nextInt();
		int chance=0;
		while(true)
		{
			try
			{
				System.out.println(s.charAt(i));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				if(chance==3)
				{
					System.out.println("You Reached Max Limit..");
					break;
				}
				System.out.println("You have "+(3-chance)+" chances to enter valid data");
				System.out.println("Re-enter the valid Index");
				i=sc.nextInt();
				chance++;
			}
		}
		
	}
}
