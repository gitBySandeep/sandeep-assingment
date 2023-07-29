/*
A
AB
ABC
ABCD
ABCDE
*/
import java.util.Scanner;
class Pattern11{
    public void star(int a){
		int i,j,b=97;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=97;j<=b;j++) {
	            System.out.print((char)(j));
	           	}   
				b++;
			System.out.println("");	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern11 obj=new Pattern11();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	