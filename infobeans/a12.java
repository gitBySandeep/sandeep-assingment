
import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter any charecter");
		n = sc.nextInt();

		switch (ch) {
			case 1:
				System.out.println("january");
				break;
			case 2:
				System.out.println("febuary");
				break;
			case 3:
				System.out.println("march");
				break;
			case 4:
				System.out.println("april");
				break;
			case 5:
				System.out.println("may");
				break;
			case 6:
				System.out.println("june");
				break;
			case 7:
				System.out.println("juy");
				break;
			case 8:
				System.out.println("auest");
				break;
			case 9:
				System.out.println("september");
				break;
			case 10:
				System.out.println("octember");
				break;
			case 10:
				System.out.println("november");
				break;
			case 12:
				System.out.println("december");
				break;

			default:
				System.out.println("invalid");
		}
	}
}
