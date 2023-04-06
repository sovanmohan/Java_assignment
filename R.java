abstract class Parent{
	abstract void show();
}
class Child extends Parent
{
	void show()
	{
		System.out.print("Ready");
	}
}
public class R {

	public static void main(String[] args) {
	Child c=new Child();
	c.show();

	}

}
