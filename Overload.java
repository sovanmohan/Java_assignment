import java.util.*;
public class Overload {
	Overload(int a,int b)
	{
		System.out.println(a+b);
	}
	Overload()
	{
		System.out.println("Yes");
	}
	Overload(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Overload q=new Overload(25,35);
		Overload t=new Overload(25.8,35.7);
		Overload e=new Overload();
		
		

	}

}
