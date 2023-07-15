//13) WAP to print N natural numbers in reverse order

import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		System.out.println ("reverse natural number");
		    for(i=n;i>=1;i--){
		        System.out.println (i);
        }      
	}
}