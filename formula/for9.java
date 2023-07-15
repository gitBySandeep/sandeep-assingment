//WAP to calculate the sum of given series 1 2 3 4 5 6 7 ................n terms 
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("enter any number");
		n = sc.nextInt();
		int s=0,i=1;
        while (i<n) {
			s = s + i;
			i++;
			}
		    System.out.print("sum=" + s);
	}   
}