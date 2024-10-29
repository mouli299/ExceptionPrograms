package approach1;

import java.util.Scanner;

public class ArrayIndexOutOfBound_Exception 
{
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner s=new Scanner(System.in);
		int a[]= {1,2,3,4,5};
		System.out.println("Enter the Array Index Value");
		int i=s.nextInt();
		System.out.println(a[i]);
	}
}
