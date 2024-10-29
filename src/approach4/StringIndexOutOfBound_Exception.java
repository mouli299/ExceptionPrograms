package approach4;

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
		while(true)
		{
			try
			{
				System.out.println(s.charAt(i));
			}   
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("Re-enter the valid Index");
				i=sc.nextInt();
//				System.out.println(s.charAt(i));
			}
		}
		
	}
}
