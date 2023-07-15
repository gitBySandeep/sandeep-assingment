//44) WAP to interchange first and last digit of a number	
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,r,temp;
		System.out.print("enter  number ");
		n = sc.nextInt();
		
		r=n%10;
	    while(n>0){
	        n=n/10;
            }
		System.out.println("first="+n);
		System.out.println("last="+r);
	}
}	