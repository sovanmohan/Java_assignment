import java.util.*;
public class Mss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int mss[]=new int[n];
		int h=0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int c=0;
		int s=0;
		while(c!=n)
		{
			for(int i=c;i<n;i++)
			{
				for(int j=c;j<=i;j++)
				{
					mss[j]=a[j];
					s=s+mss[j];
					if(s<=h)
						h=s;
				}
				s=0;
			}
			c++;
		}
		System.out.println(h);

	}

}
