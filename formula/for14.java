// WAP to input a number and check it palindrome or not
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,rev=0,r;
		System.out.print("enter  number ");
		n = sc.nextInt();
        int c=n;
		
	    while(n>0){
		    r=n%10;
            n=n/10;
            rev=10*rev+r;
        }
		System.out.println("reverse number="+rev);
        if(c==rev)
        {		
		    System.out.println("its pallindrome");
		}
		else
		{		
		    System.out.println("its not pallindrome");
		}
    }
}	