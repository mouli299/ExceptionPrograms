package customexception;

public class NotPrimeException extends RuntimeException 
{
@Override
public String toString() {
	return getClass()+": your Entered Number is not divisible by itself or 1 ie.., Not Prime Number";

}
}
