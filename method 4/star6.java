/*
1
00
111
0000
11111
*/
import java.util.Scanner;
class Pattern6{
    public void star(int a){
		int i,j;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=1;j<=i;j++) {
	            if(i%2==1)		
             	System.out.print("1");
				else
				System.out.print("0");
	           	}   
			System.out.println("");	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern6 obj=new Pattern6();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	