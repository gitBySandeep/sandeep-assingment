/*
A
BB
CCC
DDDD
EEEEE
*/
import java.util.Scanner;
class Pattern14{
    public void star(int a){
		int i,j,b=65;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=1;j<=i;j++) {
			    System.out.print((char)(b));
	        }   
			b++;
			System.out.println("");	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern14 obj=new Pattern14();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	