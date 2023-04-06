import java.util.*;
		public class Ha{
			public int myVar;
			Ha(int myVar) {
			 this.myVar = myVar;
			}
			public boolean equals(Object o) {
			 if(o instanceof Ha) { 
			 Ha hTest = (Ha) o; 
			 if (hTest.myVar == this.myVar) {
			 return true;
			 } else {
			 return false;
			 } 
			 }else {
			 return false;
			 }
			}
			public int hashCode() {
			 return (myVar * 23);
			}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int myvar=sc.nextInt();
			Ha o=new Ha(myvar);
			System.out.println(o.equals(o));
			System.out.println(o.hashCode());
			


	}

}
