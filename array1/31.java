// increment all element by one
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("limit of array ");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("element of first array");
		    for (int i = 0; i < n; i++) {
			    a[i] = sc.nextInt();
		    }

		System.out.println("increment all element by one");
		    for (int i = 0; i < n; i++)
        {
			a[i] = a[i] + 1;
			System.out.println(a[i]);
		}
	}
}
