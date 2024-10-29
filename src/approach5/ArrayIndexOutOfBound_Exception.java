package approach5;

import java.util.Scanner;

public class ArrayIndexOutOfBound_Exception 
{
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner s=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		System.out.println("Enter the Array Index Value");
		int i=s.nextInt();
		int chance=0;
		while(true)
		{
			try 
			{
				System.out.println("Result: "+a[i]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				if(chance==3)
				{
					System.out.println("You Reached Max Limit..");
					break;
				}
					System.out.println("You have "+(3-chance)+" chances to enter valid data");
				System.out.println("Re-Enter The Valid Index");
				i=s.nextInt();
				chance++;
			}
		}
	}
}
