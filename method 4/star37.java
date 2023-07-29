/*
*
**
****
*******
***********
*/	
import java.util.Scanner;
class Pattern37{
    public void star(int a){
		System.out.println("Pattern ");
		int i,j,count=1;
		for (i = 1; i <= a; i++) {
			for (j = 1; j <= count; j++) {
                System.out.print("*");
            }
			count = count + i;
			System.out.println();
		}
	
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern37 obj=new Pattern37();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	