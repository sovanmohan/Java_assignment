import java.util.*;
public class Ro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		System.out.println("Enter the input of the array");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Array");
		for(int s=0;s<n;s++)
			System.out.print(a[s]+" ");
		System.out.println();
		
		int k=2;
		int w[]=new int[n];
		int c=0;
		if(k>=0 && k<n)
		{
			for(int j=k;j<n;j++)
			{
				w[c]=a[j];
				c++;
				if(j==(n-1))
				{
					for(int j1=0;j1<2;j1++)
					{
						w[c]=a[j1];
						c++;
					}
					
				}
			}
		}
		System.out.println("Array rotation upto 2 index");
		for(int r=0;r<n;r++)
			System.out.print(w[r]+" ");

	}

}
