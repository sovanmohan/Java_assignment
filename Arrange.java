import java.util.*;
public class Arrange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==0 || a[i]==1 || a[i]==2)
				continue;
			else
			{
				System.out.println("Give number as 0, 1, 2");
				break;
			}
		}
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if(a[j]>a[j+1])
				{
					int k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
				}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		

	}

}
