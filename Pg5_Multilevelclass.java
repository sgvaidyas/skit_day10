import java.util.Scanner;

public class Pg5_Multilevelclass {
	int len,rad,bred;	
	void getdata()
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter len,bred,rad");
		len = ob.nextInt();
		bred = ob.nextInt();
		rad=ob.nextInt();
	}
	void display()
	{
		System.out.println("LEN        "+len);
		System.out.println("BRED       "+bred);
		System.out.println("RAD        "+rad);
	}
}






class MidLevel extends Pg5_Multilevelclass
{
	double areaCircle,areaSquare,areaRectangle;
	float pi;
	public MidLevel()
	{
		pi=3.142f;
	}
	void calculate()
	{
		areaCircle = pi*Math.pow(rad, 2);
		areaSquare = Math.pow(len, 2);
		areaRectangle = len*bred;
	}
	void display()
	{
		super.display();
		System.out.println("AREA...................");
		System.out.println("CIRCLE      "+areaCircle);
		System.out.println("RECTANGLE   "+areaRectangle);
		System.out.println("SQUARE      "+areaSquare);
	}
}

class ImplementChild extends MidLevel
{
	double periCircle,periSquare,periRectangle;
	public void calculate()
	{
		super.calculate();
		periCircle = 2*pi*rad;
		periSquare = 4*len;
		periRectangle = 2*(len+bred);
	}
	public void display()
	{
		super.display();
		System.out.println("PERIMETERS...................");
		System.out.println("CIRCLE      "+periCircle);
		System.out.println("RECTANGLE   "+periRectangle);
		System.out.println("SQUARE      "+periSquare);
	}
}