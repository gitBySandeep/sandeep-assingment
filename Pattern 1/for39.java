import java.util.Scanner;

class Add {
	public static void main(String[] args) {
		int n,m=0,r,s=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();
		
		for (int i = n; i <= n; i++) {
			 m=i;
			while (m > 0) {
				r = m % 10;
                int fact=1;
			for (int j = 1 ; j <= r; j++) {
					fact = fact * j;
				}
				s = s + fact;
                m = m / 10;
            }				

			
		}
		

		if (n== s) {
			System.out.println(" its strong number" +s);
		} else {
			System.out.println(" its not strong number");
		}
	}
}
