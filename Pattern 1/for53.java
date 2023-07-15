//53) WAP to print all the strong numbers between two entered numbers
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int n, n1, r=0,s = 0, i, j;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();
		System.out.println("enter any number");
		n1 = sc.nextInt();

		for (i = n; i <= n1; i++) {
			int m=i;
			while (m > 0) {
				r = m % 10;
                int fact=1;
			for (j = 1 ; j <= r; j++) {
					fact = fact * j;
				}
				s = s + fact;
                m = m / 10;
				
			}
			if (s == i)
				System.out.println(i + " is strong number");
				s = 0;	
		}
		
	}	  
	
}
 