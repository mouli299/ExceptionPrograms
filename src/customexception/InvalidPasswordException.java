package customexception;

public class InvalidPasswordException extends RuntimeException {
@Override
public String toString() {

 return getClass()+": Your Enterd Invalid Password";
}
}
