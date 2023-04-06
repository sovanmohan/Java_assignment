import java.util.*;
interface A{
int a=87;
int b=88;
}
abstract class U{
	abstract void sum(int a,int b);
}
class B extends U implements A{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
}
public class D {
	

	public static void main(String[] args) {
		B e=new B();
		int a=87;
		int b=88;
		e.sum(a, b);

	}

}
