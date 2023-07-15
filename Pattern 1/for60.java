//60) WAP to print Square, Cube and Square Root of all numbers from 1 to N
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int n, n1, i, j, k;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();
		System.out.println("enter any number");
		n1 = sc.nextInt();

		for (i = n; i <= n1; i++) {

			j = i * i;
			k = i * i * i;

			System.out.println("  square root" + Math.sqrt(i));
			System.out.println(+j + " is a square of" + i);
			System.out.println(+k + " is a cube of" + i);
			j = 0;
			k = 0;
		}
	}
}
