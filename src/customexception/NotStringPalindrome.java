package customexception;

public class NotStringPalindrome extends RuntimeException {
@Override
public String toString()
{
	return getClass()+": your string is Not a palindrome String";
}
}
