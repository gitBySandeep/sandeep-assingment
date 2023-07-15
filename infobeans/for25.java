// Calculate the sum of following serires
   1/x + 1/x^2 + 1/x^3......1/x^n
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pow=1;
        System.out.println("enter number");
		int x=sc.nextInt();
		System.out.println("enter number");
		int n=sc.nextInt();
		
		float sum=0; 
        for(int i=1;i<=n;i++){
			pow=pow*x;
			float a=1.0f/pow;
            sum=sum+a;
		}
        System.out.println(sum);
	}
}	