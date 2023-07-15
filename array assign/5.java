//Q.5 Find the kth largest and kth smallest element in array.	
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("after sorting");
        int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(+a[i]);
        }
		System.out.println("after delete double element");
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				if (a[i]==a[j])
				break;
		}
		if(j==i)
		System.out.println(+a[i]);
	    }
		
		System.out.println("enter position for largest element");
		int k=sc.nextInt();
		
		System.out.println("enter position for smallest element");
		int s=sc.nextInt();
		
		System.out.println(" largest number" + a[n -k ]);
		System.out.println("smallest number" + a[s-1]);
	}
}