import java.util.Scanner;

class Employee extends Pg2_Parent
{
	String emp_name;
	
	public void getdata()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the emp name ");
		emp_name=ob.nextLine();
		//Parent class function is called by super
		super.getdata();
	}
	public void display()
	{
		super.display();
		System.out.println("EMPNAME =  " + emp_name);
	}
}
class Student extends Pg2_Parent
{
	String stu_name;
	public void getdata()
	{		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the stu name ");
		stu_name=ob.nextLine();
		super.getdata();
	}
	public void display()
	{
		super.display();
		System.out.println("STUNAME =  " + stu_name);
	}
}
public class Pg4_Hierarchy_ {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.getdata();
		emp.display();		
		Student s = new Student();
		s.getdata();
		s.display();
	}
}
