//WAP to print N even numbers

import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n;
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
 		    if(i%2==0) 
	        System.out.println(+i);
		} 
    }
} 