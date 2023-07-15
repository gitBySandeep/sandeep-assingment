// assign nsize of array;
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[50];
		int b[] = new int[100];
		a = b;

		System.out.println("assign number b to a=\t" + a.length);

	}
}