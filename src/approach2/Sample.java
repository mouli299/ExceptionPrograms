package approach2;

class A
{
	public void testA() 
	{
		System.out.println("test A method");
	}
}
class B extends A
{
	public void testB()
	{
		System.out.println("test B method");
	}
}
class C extends A
{
	public void testC()
	{
		System.out.println("test C method");
	}
}
public class Sample 
{
	public static void main(String[] args) 
	{
		try
		{
			A a=(A)new B();
			a.testA();
			B b=(B)a;
			b.testA();
			C c=(C)new A();
			c.testA();
			c.testC();
		}
		catch(ClassCastException a)
		{
			System.out.println("down casting not possible with out upcasting");
		}
	}
}
