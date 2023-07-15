import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int n = sc.nextInt();
		int d;
		int s = 0;

		for (d = 1; d <= n; d++) {

			System.out.println("day=" + d);
			s = d;
		}
		if (s == 28) {
			System.out.println("ferbuary=" + s);
		}
		if (s == 31) {
			System.out.println("january,march,may,june,july,september,december");
		}
	}
}