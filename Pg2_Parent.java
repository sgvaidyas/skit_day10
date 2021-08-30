import java.util.Scanner;

public class Pg2_Parent {
	int roll,marks;
	public void getdata()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the roll & marks ");
		roll=ob.nextInt();
		marks=ob.nextInt();
	}	
	public void getdata(int x,int y)
	{
		roll=x;
		marks=y;
	}
	public void display()
	{
		System.out.println("ROLL      = " + roll);
		System.out.println("MARKS     = " + marks);		
	}	
}
