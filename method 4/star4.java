/*
*****
*****
*****
*****
*****
*/
import java.util.Scanner;
class Pattern4{
    public void star(int a,int b){
		int i,j;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=1;j<=b;j++) {		
             	System.out.print("*");
	           	}   
			System.out.println("");	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern4 obj=new Pattern4();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		System.out.println("enter column ");
		int b=sc.nextInt();
		obj.star(a,b);
	}
}	