// peak element which is Big its neighbour
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
        boolean flag=false;
		System.out.println("peak element");
		for (int i = 1; i < n - 1; i++) {
			if (a[i] > a[i - 1] && a[i] > a[i + 1])
				flag=true;
			    break;
		}
		if(flag)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
