// WAP to calculate the sum of given series 2 4 6 8 10.....................n terms
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("enter any number");
		n = sc.nextInt();
		int i = 2,s=0;
	

		while (i <= n) {
			s = s + i;
			i=i+2;;
		}
		System.out.print("sum=" + s);
	}
}