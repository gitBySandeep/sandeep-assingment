//8. WAP to calculate the sum of given series x^1 + x^2 + x ^3.........x^n 
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n,n1,count=0;
		System.out.print("enter  number ");
		n = sc.nextInt();
		System.out.print("enter  number ");
		n1 = sc.nextInt();

        int r=1,s=0;
		
		while(n1!=0){
		r=r*n;
		s=s+r;
		n1--;
		}
            System.out.println("sum ="+s);
	}
}	