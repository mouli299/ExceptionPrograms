package customexception;

import java.util.Scanner;

public class StringPalindrone 
{
	public static boolean isPalindrome(String s)
	{
		String a="";
		for(int i=s.length()-1;i>=0;i--)
		{
			a=a+s.charAt(i);
		}
		if( s.equals(a))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String Value");
		String a=sc.nextLine();
		if(isPalindrome(a))
		{
			System.out.println("the given string is palindrome");
		}
		else
		{
			NotStringPalindrome e=new NotStringPalindrome();
			throw e;
		}
		
	}
}
