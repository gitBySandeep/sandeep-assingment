/*
*********
******* 
***** 
***
* 

*/	
import java.util.Scanner;
class Pattern62{
    public void star(int a){
		System.out.println("Pattern ");
        	int i, c = a*2;
		for (i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= c; j++) {
				System.out.print("*");
			}
			c = c - 2;
			System.out.println(" ");
		}
    }
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern62 obj=new Pattern62();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	