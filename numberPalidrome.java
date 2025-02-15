
public class numberPalidrome {
	public static void main(String[] args) {
		System.out.println("Enter a  number ");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int a=sc.nextInt();
		int copy=a;
		int reverse=0;
		
		while(a!=0 ) {
			int reminder = a%10;
			
			reverse = reverse*10+reminder;
			
			a /=10;
		}
		
		if(copy==reverse) {
			System.out.println("this is palidrome");
		}else {
			System.out.println("this is not palidrome");
		}
		
	}
}
