//23. WAP to print all armstrong number from 101 to 999 
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,s=0,r,n;
		
		System.out.println("all Armstrong number");
        for(i=101;i<=999;i++){
	        n=i;
        while(n>0){			
		    r=n%10;
            n=n/10;
			s=s+(r*r*r);
        }
		if(s==i)
		    System.out.println(+i);
		    s=0;
	   }
	}
}	