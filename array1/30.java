//insert an element at specific position in array
import java.util.Scanner;
     
	 class Test {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("enter number of position");
		int pos = sc.nextInt();
		System.out.println("enter number");
		int num = sc.nextInt();

		System.out.println("number of first array");
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 4; i > pos - 1; i--) {
			a[i] = a[i - 1];
		}

		a[pos - 1] = num;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}