//15 WAP to to input 3 digit number and check it is armstron or not
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("enter three number digit");
		n = sc.nextInt();
		int r = 0;
		int s = 0;
		int t = 0;
		int a;
		a = n;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			s = r * r * r;
			t = t + s;
		}
		System.out.print("number   =" + t);

		if (a == t) {
			System.out.println("armstrong number");
		} else {
			System.out.println(" not a armstrong number");
		}
	}
}
