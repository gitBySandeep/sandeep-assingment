//8)WAP to print Fibonacci series.

import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n,n1,n2,n3;
		n1=0;
		n2=1;	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
 		     
	        System.out.println(n1);
            n3=n1+n2;
			n1=n2;
			n2=n3;
		} 
    }
}