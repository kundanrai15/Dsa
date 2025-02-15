import java.util.*;
public class StringPalidromeUseBuilder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String s=sc.next();
		String copy=s;
		StringBuilder s1=new StringBuilder(s);
		s1.reverse();
		s=s1.toString();
		
		if(s.equals(copy)) {
			System.out.println("this is palidrome");
		}else {
			System.out.println("this is not palidrome");
		}
		
	}
}
