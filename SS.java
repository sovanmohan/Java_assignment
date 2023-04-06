import java.util.*;
public class SS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]>a[j])
				{
					int k=a[i];
					a[i]=a[j];
					a[j]=k;
				}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");

	}

}
