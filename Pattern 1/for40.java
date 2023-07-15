import java.util.Scanner;

class Add {
	public static void main(String[] args) {
		int n = 0, evenc = 0, r, oddc = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();
		while (n > 0) {
			r = n % 10;

			if (r % 2 == 0) {
				evenc++;

			} else {
				oddc++;

			}
			n = n / 10;
		}
		System.out.println("evenc=" + evenc);
		System.out.println("oddc=" + oddc);

	}
}