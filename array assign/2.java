//Q.2 Find minimum and maximum element in array;
import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of Array");
		int n=sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("enter number");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int max = a[0];
		int min = a[0];

		for (int i = 0; i < n; i++) {
			if (max < a[i])
				max = a[i];

			if (min > a[i])
				min = a[i];
		}
		System.out.println("maximum number" + max); 
		System.out.println("minimum number" + min);
	 	
	}
}

