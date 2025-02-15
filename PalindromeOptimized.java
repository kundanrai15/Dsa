
import java.util.*;

public class PalindromeOptimized {
	public static boolean isPalidrome(int num) {
		int reversehalf=0;
		int reminder=0;
		if(num<0 || ( num%10==0 &&num!=0)) {
			return false;
		}
		while(num>reversehalf) {
			reminder= num%10;
			reversehalf=reversehalf*10+reminder;
			num /=10;
			
		}
		
		
		return num==reversehalf || num==reversehalf/10;
	}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if(isPalidrome(number)){
        	System.out.println("this is palidrome");
        }else {
        	System.out.println("this is not palidrome ");
        }
        
    }
}
