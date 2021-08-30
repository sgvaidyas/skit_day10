
class A
{
	public A()
	{
		System.out.println("A class");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("B class");
	}
}
class C extends B
{
	public C()
	{
		System.out.println("C class");
	}
}
public class Pg7_constructorsInher {
	public static void main(String[] args) {
		C ob = new C();
	}
}
