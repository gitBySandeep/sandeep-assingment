//22. WAP to print all palindrome number from 101 to 199 
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,rev=0,r,n;
		
		System.out.println("all pallindrome number");
        for(i=101;i<=199;i++){
	        n=i;
        while(n>0){			
		    r=n%10;
            n=n/10;
            rev=10*rev+r;
        }
		if(rev==i)
		    System.out.println(+i);
		    rev=0;
	   }
	}
}	