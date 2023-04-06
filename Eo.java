import java.util.*;
public class Eo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int e[]=new int[n];
		int o[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=0;
		int k=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				e[j]=a[i];
				j++;
			}
			else
			{
				o[k]=a[i];
				k++;
			}
		}
		System.out.println("Even array");
		for(int i=0;i<j;i++)
			System.out.print(e[i]+" ");
		System.out.println(" ");
		System.out.println("Odd array");
		for(int i=0;i<k;i++)
			System.out.print(o[i]+" ");


	}

}
