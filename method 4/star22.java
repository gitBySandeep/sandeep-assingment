/*
*
**
*@*
*@@*
* * * * *
*/
import java.util.Scanner;
class Pattern22{
    public void star(int a){
		int i,j,b=97;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=1;j<=i;j++) {
                if(i==j||j==1||i==a)			
			    System.out.print("*");
			    else
				System.out.print("@");
	        }   
		System.out.println("");	  	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern22 obj=new Pattern22();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	