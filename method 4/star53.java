/*
    A
   A B
  A B C
 A B C D
A B C D E  

*/
	
import java.util.Scanner;
class Pattern53{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j, k, c = 65;
		for (i = 1; i <= 5; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 65; k <= c; k++) {

				System.out.print((" " + (char) k));
			}
			++c;

			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern53 obj=new Pattern53();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	