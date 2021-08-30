class X
{
	int x;
	public X(int a)
	{
		x=a;
	}
}

class Y extends X
{
	int y;
	public Y(int a,int b)
	{
		super(a);
		y=b;
	}
	public void display()
	{
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
	}
}
class Z extends Y
{
	int z;
	public Z(int a,int b,int c)
	{
		super(a,b);
		z=c;
	}
	public void display()
	{
		super.display();

		System.out.println("z = "+ z);
	}
}
public class Pg8_Constr_param_inh {

	public static void main(String[] args) {
		Z ob = new Z(7,8,9);
		ob.display();
	}

}
