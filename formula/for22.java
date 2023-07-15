//WAP to print all palindrome number from 101 to 199 
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n=0,rev=0,r;
		for(i=101;i<=199;i++){
		n=i;
		while(n>0){
		    r=n%10;
            rev=10*rev+r;
		    n=n/10;
        }
		if(rev==i)
        {		
		    System.out.println("its pallindrome"+rev);
		}
		rev=0;
		}
    }
}	