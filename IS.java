import java.util.*;
public class IS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			int k=a[i];
			int j=i-1;
			while(j>=0 && k<a[j])
			{
				a[j+1]=a[j];
				--j;
			}
			a[j+1]=k;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");

	}

}
