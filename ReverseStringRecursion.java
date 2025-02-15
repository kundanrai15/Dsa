
public class ReverseStringRecursion {
	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String s=sc.next();
		
	}
	
	public static String  StringRecursion(String str) {
		
		if(str.isEmpty()) {
			return str;
		}
		
		return StringRecursion(str.substring(1)+str.charAt(0));
	}
}
