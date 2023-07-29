/*
*
##
***
####
*****
*/
import java.util.Scanner;
class Pattern16{
    public void star(int a){
		int i,j;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=1;j<=i;j++) {
                if(i%2==1)			
			    System.out.print("*");
				else
			    System.out.print("#");
			}   
		System.out.println("");	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern16 obj=new Pattern16();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	