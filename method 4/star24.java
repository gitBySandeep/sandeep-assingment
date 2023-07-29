/*
*
*#
*#*
*#*#
*#*#*
*/
import java.util.Scanner;
class Pattern24{
    public void star(int a){
		int i,j,b=5;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=5;j>=b;j--) {
			if(j==5||j==3||j==1)
                System.out.print("*");
			else
            System.out.print("#");			
			}  
		b--;	
		System.out.println("");	  	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern24 obj=new Pattern24();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	