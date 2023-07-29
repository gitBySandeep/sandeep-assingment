/*
*
*_*
*___* 
*_____* 
*********

*/
	
import java.util.Scanner;
class Pattern58{
    public void star(int a){
		System.out.println("Pattern ");
	int i, c = 1;
		for (i = 1; i <= 9; i = i + 2) {
			for (int j = 4; j >= c; j--) {
				System.out.print(" ");
			}

			c++;

			for (int j = 1; j <= i; j++) {
				if ((i == 9 || j == 1 || j == i))
					System.out.print("*");
				else
					System.out.print("_");
			}
			System.out.println(" ");
		}
    }
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern58 obj=new Pattern58();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	