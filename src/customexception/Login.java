package customexception;

import java.util.Scanner;

public class Login {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the UserName");
	String userName=sc.next();
	System.out.println("Enter the Password");
	int password=sc.nextInt();
	
	if(userName.equals("Admin"))
	{
		if(password==123)
		{
			System.out.println("Login Successfull");
		}
		else
		{
			InvalidPasswordException e=new InvalidPasswordException();
			throw e;
		}
	}
	else
	{
		InvalidUserNameException e1=new InvalidUserNameException();
		throw e1;
	}
}
}
