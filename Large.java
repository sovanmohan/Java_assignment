import java.util.*;
public class Large {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if(a[j]>a[j+1])
				{
					int k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
				}
		System.out.println("Largest element "+a[n-1]);
		

	}

}
