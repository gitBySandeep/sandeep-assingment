//wap to ask 5 names from user and check if particular name exist or not
import java.util.Scanner;
class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a[] = { "Ram", "Sandeep", "Rahul", "pratik", "Abhimanyu" };

		System.out.print("check name in index");
		String c = sc.nextLine();

		for (int i = 0; i < 5; i++) {
			if (a[i].equals(c))
				System.out.println("found in index" + c);

		}
	}
}
