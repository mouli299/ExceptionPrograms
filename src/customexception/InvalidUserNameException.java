package customexception;

public class InvalidUserNameException  extends RuntimeException
{
	@Override
	public String toString() 
	{
		return getClass()+": Your Entered Invalid UserName";
	}
}
