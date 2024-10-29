package approach2;

import java.util.Scanner;

public class ArrayIndexOutOfBound_Exception 
{
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner s=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		System.out.println("Enter the Array Index Value");
		int i=s.nextInt();
		try 
		{
			System.out.println("Result: "+a[i]);	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Re-Enter The Valid Index");
			i=s.nextInt();
			System.out.println("Result: "+a[i]);
		}
	}
}
