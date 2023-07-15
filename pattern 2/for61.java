//61) WAP to find out all the leap years between two entered years
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int n, n1, i;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any year");
		n = sc.nextInt();
		System.out.println("enter any year");
		n1 = sc.nextInt();

		for (i = n; i <= n1; i++) {

			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {

				System.out.println(+i + " leap year" );

			}
		}
	}
}