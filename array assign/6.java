//Q.5 Find occurance of an integer number in array.
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
         System.out.println("after shorting");
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
		
        System.out.println("enter number for occurance");
		int b=sc.nextInt();
		int c=0;
		for (int i = 0; i < n; i++) {
			if (a[i]==b)
			c++;
		}
		System.out.println("occurance of"+b+"is :"+c);
	}
}	