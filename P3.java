import java.util.*;
public class P3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int i=sc.nextInt();
		int j=sc.nextInt();
		int e=0;
		while(n!=0)
		{
			int r=n%2;
			if((i<=c)&&(j<=c))
				if(j!=i)
				{
					if(c==i)
					{
						i=r;
						int o=i;
						
					}
					if(c==j)
					{
						j=r;
						int u=j;
					}
				}
			int k=i;
			i=j;
			j=k;	
			e=e+(int)Math.pow(2, c)*r;
			n=n/2;
			c++;
			
		}
		System.out.println(e);
		

	}

}
