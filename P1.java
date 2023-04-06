import java.util.*;
public class P1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		while(n!=0)
		{
			int r=n%2;
			c++;
			n=n/2;
		}
		System.out.println(c);
		

	}

}
