// WAP to calculate the reverse of any given number
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,rev=0,r;
		System.out.print("enter  number ");
		n = sc.nextInt();
        
		while(n>0){
		    r=n%10;
            n=n/10;
            rev=10*rev+r;
        }
     	System.out.println("rev number="+rev);	
    }
}	