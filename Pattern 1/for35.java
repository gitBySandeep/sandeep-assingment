import java.util.Scanner;

class Add {
	public static void main(String[] args) {
		int i, n, r, s = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			s = s + r;

		}
		System.out.println("count of digits" + s);

	}
}