//34) WAP to check whether entered number is perfect or not
import java.util.Scanner;

class Add {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number");
		int n = sc.nextInt();
		int i, s = 0, p = n;
		for (i = 1; i < n; i++) {

			if (n % i == 0) {
				s = s + i;
            }        
        }
            if (p == s) {
			  System.out.println("perfect number");
         	} else{
					System.out.println("not a perfect");
			}
	}
}
