//52) WAP to find out all the Armstrong numbers between two entered numbers
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ,r,i;
		
		System.out.println("Armstrong number");
		for (i=101; i<=999; i++) {
            n=i;
			int s=0;
			while(n!=0){		    
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
			}
			if(i==s){
		        System.out.println(s);	
 		    }
		}
	}
}	
			
        			