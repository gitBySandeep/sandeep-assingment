//5WAP to find out the factorial of a number.

import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n,s=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
		    s=s*i;
           			 
        }
	    System.out.println ("factorial="+s);
	}
}