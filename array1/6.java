//wap to define an array of integer of size 6 .Take input from user and display it in reverse
order
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int a[] = new int[6];
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 6; i++) {
			System.out.println("enter number");
			a[i] = sc.nextInt();
		}

		for (int i = 5; i > 0; i--) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}

}
