abstract class Parent2{
	abstract void show();
}

public class Child2 extends Parent2  {
	void show()
	{
		System.out.print("Ready");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.show();

	}

}
