// print positive,negetive,zero,odd,even;
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int sum;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("enter number");
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			if (a[i] > 0)
				System.out.println("Number is positive" + a[i]);
			if (a[i] < 0)
				System.out.println("Number is negetive" + a[i]);
			if (a[i] % 2 == 0)
				System.out.println("Number is even" + a[i]);
			else
				System.out.println("Number is odd" + a[i]);
			if (a[i] == 0)
				System.out.println("Number is zero" + a[i]);
		}
		System.out.println();
	}

}
