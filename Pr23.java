import java.util.*;
public class Pr23 {
		 public static void main(String args[]) { 
		 String myStr = "My Favourite Programming Language : Java";
		StringBuffer myStrBuff=new StringBuffer();
		StringBuilder myStrBuild=new StringBuilder();
		System.gc();
		 }
		private static void runStringBuilder(StringBuilder myStr) {
		long begin=new GregorianCalendar().getTimeInMillis();
		long initiateMemory=Runtime.getRuntime().freeMemory();
		for (int j=0;j<50000;j++)
		{
			myStr.append(":"+j);
			myStr.insert(j,"Hello");
		}
		long finish=new GregorianCalendar().getTimeInMillis();
		long stopMemory=Runtime.getRuntime().freeMemory();
		System.out.println("Time Taken String Builder Append Insert "+(finish-begin));
		 System.out.println("Memory	used	String	Builder	Append	Insert:"	+	(initiateMemory	-	
				 stopMemory));
	}
		
	

}
