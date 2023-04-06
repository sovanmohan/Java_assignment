import java.util.ArrayList;
import java.util.Scanner;
public class Arl {

	public static void main(String[] args) {
		ArrayList <Integer>arl=new <Integer>ArrayList();
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		while(c!="n")
		{
			arl.add(sc.nextInt());
			c=sc.next();
		}
		System.out.println(arl);
		

	}

}
