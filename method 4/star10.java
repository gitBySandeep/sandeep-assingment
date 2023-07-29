/*
A
AB
ABC
ABCD
ABCDE
*/
import java.util.Scanner;
class Pattern10{
    public void star(int a){
		int i,j,b=65;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=65;j<=b;j++) {
	            System.out.print((char)(j));
	           	}   
				b++;
			System.out.println("");	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern10 obj=new Pattern10();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	