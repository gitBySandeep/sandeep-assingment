//12 WAP to program to calculate the factorial of any given number.
import java.util.Scanner;
class Test{
	public static void main(String []args){
		Scanner sc=new Scanner (System.in);
		int n;
		System.out.print("enter any number");
		n=sc.nextInt();
		int i=1;
		int s=1;
	    int t=0;
		   
		while(i<=n){
		    s=s*i;
		 	i++;
		    t=s;
		}
		System.out.print("factorial="+t);
	}
}	