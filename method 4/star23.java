/*
5
54
543
5432
54321
*/
import java.util.Scanner;
class Pattern23{
    public void star(int x){
		int i,j,b=5;
		System.out.println("Pattern ");
        for (i=1; i<=x; i++) {
		    for (j=5;j>=b;j--) {
                System.out.print(j);
			}  
		b--;	
		System.out.println("");	  	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern23 obj=new Pattern23();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	