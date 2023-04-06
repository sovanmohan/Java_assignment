import java.util.*;
public class Rev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int rev[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int j=0,k=(n-1);j<n;j++,k--)
			rev[j]=a[k];
		System.out.println("The reverse of array");
		for(int i=0;i<n;i++)
			System.out.print(rev[i]+" ");

	}

}
