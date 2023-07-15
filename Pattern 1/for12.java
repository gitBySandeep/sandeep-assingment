
//12) WAP to print Odd numbers upto N.

import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n;
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		for(i=n;i>=1;i--){
 		    if(i%2==1) 
	        System.out.println(+i);
		} 
    }
} 