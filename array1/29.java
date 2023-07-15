//misssing number in array
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		int sum = 0;
		int sum1 = 0;

		System.out.println("number of first array");
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();

		}

		for (int i = 0; i < 5; i++) {
			sum = sum + a[i];
		}

		for (int i = 1; i <= 6; i++) {
			sum1 = sum1 + i;
		}

		int diff = sum1 - sum;
		System.out.println("Missing number in Array" + diff);

	}

}