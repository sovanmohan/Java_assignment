class Test1 <G>
{
	 public G e;
	public void add(G e )
	{
		System.out.println(e);
	}
}
public class Gtest {

	public static void main(String[] args) {
		Test1 <Integer> t1=new <Integer> Test1();
		Test1 <String> t2=new <String> Test1();
		Integer a=34;
		Integer b=78;
		Integer s=a+b;
		String a1="33";
		String b1="33";
		String w=a1+b1;
		t1.add(s);
		t2.add(w);
	}

}
