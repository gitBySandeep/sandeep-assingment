//print to size of uesr
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array limit");
		int b = sc.nextInt();
		int a[] = new int[b];

		System.out.println("length of the array=" + a.length);
	}
}
