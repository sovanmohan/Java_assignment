
public class SR <T> {
	static <T> void eq(T a)
	{
			System.out.println(a);
	}
	

	public static void main(String[] args) {
		String a="sovan";
		String b="sohan";
		String r=a+b;
		eq(r);
		Integer w=78;
		Integer q=78;
		Integer u=w+q;
		eq(u);
		
	}

}
