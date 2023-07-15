//17. WAP to calculate x^y (x to the power y)
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int n=sc.nextInt();
		System.out.println("enter second number");
		int n1=sc.nextInt();
		int r=1;
		
		while(n1!=0){
		    r=r*n;
			--n1;
		}
        System.out.println("result ="+r);
	}
}	