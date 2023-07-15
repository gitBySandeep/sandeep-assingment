//WAP to print N odd numbers

import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n;
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
 		    if(i%2==1) 
	        System.out.println(+i);
		} 
    }
} 