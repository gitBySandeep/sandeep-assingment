//45) WAP to find out the sum of all the digits of a number	
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,s=0,r;
		System.out.print("enter  number ");
		n = sc.nextInt();
		
	    while(n>0){
		    r=n%10;
            n=n/10;
            s=s+r;			
        }
		System.out.println("Sum="+s);
	}
}	