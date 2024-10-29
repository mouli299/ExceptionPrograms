package approach4;

import java.util.Scanner;

public class ArrayIndexOutOfBound_Exception 
{
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner s=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		System.out.println("Enter the Array Index Value");
		int i=s.nextInt();
		while(true)
		{
			try 
			{
				System.out.println("Result: "+a[i]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Re-Enter The Valid Index");
				i=s.nextInt();
			}
		}
	}
}
