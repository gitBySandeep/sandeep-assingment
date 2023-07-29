//52) WAP to find out all the Armstrong numbers between two entered numbers
import java.util.Scanner;
class  Armstrong {
    public void num(int a,int b){
        int rev = 0,n,r,i;
		for (i=a; i<=b; i++) {
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
	

class NumberTest{
    public static void main(String[]args){
	    Armstrong obj=new Armstrong();
		Scanner sc=new Scanner(System.in);
		obj.num(101,999);
	}
}	
