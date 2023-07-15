//WAP to check whether entered number is prime or not

import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		for(i=2;i<=n/2;i++){
 		    if(n%i==0){
	            break;	 
            }
	    } 
		if(i>(n/2)){
	            System.out.print("number is prime"+n);
	        } 
		else{
	           System.out.print("number is not prime"+n);
            }
	}		
} 