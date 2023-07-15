import java.util.Scanner

class Test {
	public static void main(String args[]) {
		System.out.print("enter any number");
		n = sc.nextInt();

		switch (n) {

			case 1:
				System.out.print("sunday");
				break;
			case 2:
				System.out.print("monday");
				break;
			case 3:
				System.out.print("tuesday");
				break;
			case 4:
				System.out.print("wednesday");
				break;
			case 5:
				System.out.print("thusday");
				break;
			case 6:
				System.out.print("friday");
				break;
			case 7:
				System.out.print("saturday");
				break;
			default:
				System.out.print("invalid");
		}

	}
}