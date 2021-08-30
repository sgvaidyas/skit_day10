class One
{
	public One(int x)
	{
		System.out.println("X = " +x);
	}
}
class Two extends One
{
	public Two(int a)
	{
		super(a);
		System.out.println("Class 2");
	}
}
class Three extends Two
{
	public Three(int a)
	{
		super(a);
		System.out.println("Class 3");
		
	}
}


public class Pg10_const_param_inh1 {

	public static void main(String[] args) {
		Three ob = new Three(66);
	}

}
