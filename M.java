import java.util.*;
public class M {
	static void miss(int a[],int n)
	{
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if(a[j]>a[j+1])
				{
					int k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
				}
		int m=a[0];
		for(int i=0;i<n;i++)
		{
			if(i!=(n-1))
			{
				if(a[i]<=m && m<a[i+1])
				{
					m++;
				}
				else
				{
					System.out.println(m);
					break;
				}
			}
			else if(i==(n-1))
			{
				if(a[i]<=m)
				{
					m++;
				}
				else
				{
					System.out.println(m);
					break;
				}
			}
			
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		miss(a,n);

	}

}
