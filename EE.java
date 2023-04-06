
public class EE<T>{
	static <T> void eq(T a,T b)
	{
		if(a.equals(b))
			System.out.println("True");
		else
			System.out.println("False");
	}
	

	public static void main(String[] args) {
		String a="sovan";
		String b="sohan";
		eq(a,b);
		Integer w=78;
		Integer q=78;
		eq(w,q);
		
	}

}
