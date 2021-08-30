import java.util.Scanner;

class Artist
{
	String name,skill;
	//static variable
	static int count;
	public Artist()
	{
		count++;
	}
	public void getdata()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter name & skill");
		name = ob.nextLine();
		skill = ob.nextLine();		
	}
	public void display()
	{
		System.out.println("COUNT    = " + count);		
		System.out.println("NAME     = " + name);
		System.out.println("SKILL    = " + skill);	
	}
	//static method
	public static void message()
	{
		System.out.println("Check this!!");
	}
	//static block
	static
	{
		System.out.println("hey i m static block");
	}
}

public class Prog1 {

	public static void main(String[] args) {
		Artist.message();
		Artist a1 = new Artist();
		System.out.println("count = " + Artist.count);
		a1.message();
		Artist a2 = new Artist();
		System.out.println("count = " + Artist.count);
		a1.getdata();
		a2.getdata();
		a1.display();
		a2.display();
		
		System.out.println("count = " + Artist.count);
		
	}

}
