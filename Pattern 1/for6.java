//6)WAP to find out the factors of a number.

import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		
		System.out.println("factor");
		for(i=1;i<=n;i++){
 		    if(n%i==0){
	              System.out.print( +i+",");	 
            }
	    }
	} 
}