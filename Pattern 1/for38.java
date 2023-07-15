//
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,s=0,r;
		System.out.print("enter  number ");
		n = sc.nextInt();
        int c=n;
		
	    while(n>0){
		    r=n%10;
            s=s+(r*r*r);
		    n=n/10; 
        }
		System.out.println("Armstrong number="+s);
        if(c==s)
        {		
		    System.out.println("its Armstrong number");
		}
		else
		{		
		    System.out.println("its not Armstrong number");
		}
    }
}