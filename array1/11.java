//prime number
import java.util.Scanner;
class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array limit");
		int b = sc.nextInt();
		int a[] = new int[b];
		int c = 0;

		for (int i = 0; i < b; i++) {
			System.out.print("enter the element of array");
			a[i] = sc.nextInt();
		}
		int i;
		for (i = 0; i < b; i++) {
			for (int j = 2; j <= a[i] / 2; j++) {
				if (a[i] % j == 0) {
					c++;
					break;
				}
			}
			if (c == 0)
				System.out.println(a[i] + "is a prime number");
			c = 0;
		}

	}
}
