/*
*
*
*
*
*
*/
import java.util.Scanner;
class Pattern2{
    public void star(int a){
		int i,j;
		System.out.println("Pattern ");
        for (i = 1; i <= a; i++) {
		    for (j = i; j <= i; j++) {
             	System.out.println("*");
	        }   
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern2 obj=new Pattern2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	