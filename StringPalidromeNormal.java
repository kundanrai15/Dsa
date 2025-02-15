import java.util.*;
public class StringPalidromeNormal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String s=sc.next();
		int left=0;
		int right=s.length()-1;
		boolean flag=true;
		
		while(left<right-1) {
			if(s.charAt(left) !=s.charAt(right) ) {
				flag=false;
				break;
			}
			left++;
			right--;
		}
		
		if(flag) {
			System.out.println("this is palindrome");
		}else {
			System.out.println("this is not palindrome");
		}
		
		
	}
}


