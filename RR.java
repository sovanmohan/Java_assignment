import java.util.*;
interface Q1{
	int a1=3;
	int b1=7;
}
interface Q2{
	int a2=6;
	int b2=5;
}
interface Q3{
	int a3=33;
	int a4=88;
}
class T implements Q1,Q2,Q3{
	void add()
	{
		System.out.println(a1+b1+a2+b2+a3+a4);
	}
}
public class RR {

	public static void main(String[] args) {
		T e=new T();
		e.add();

	}

}
