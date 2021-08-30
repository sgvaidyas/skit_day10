
//Child = Pg3_SingleInherit
public class Pg3_SingleInherit extends Pg2_Parent {
	//child data member
	int grace;	
	public Pg3_SingleInherit(int x)
	{
		grace = x;
	}
	
	public void incrementmarks()
	{
		marks=marks+grace;
	}
	public static void main(String[] args) {
		Pg3_SingleInherit ob = new Pg3_SingleInherit(8);
		
		ob.getdata(88, 66);
		ob.display();
		ob.incrementmarks();
		ob.display();
	}

}
