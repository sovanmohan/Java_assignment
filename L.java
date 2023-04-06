import java.util.*;
public class L {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			c++;
		}
		System.out.println("No of elements present in an array "+c);

	}

}
