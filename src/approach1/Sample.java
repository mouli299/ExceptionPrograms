package approach1;

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
			A a=(A)new B();
			a.testA();
			B b=(B)a;
			b.testA();
			b.testB();
			A a1=(A)new C();
			a1.testA();
			C c=(C)a1;
			c.testA();
			c.testC();
	}
}
