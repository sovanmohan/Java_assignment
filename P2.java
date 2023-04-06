import java.util.*;
public class P2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int d=0;
		while(n!=0)
		{
			int r=n%2;
			if(r==1)
				c++;
			else
				d++;
			n=n/2;
		}
		if((c%2!=0)&&(d%2!=0))
			System.out.println("T Parity");
		else
			System.out.println("Not a t parity");

	}

}
