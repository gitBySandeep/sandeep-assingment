/*
A
ABC
ABCDE
ABCDEEF
ABCDEFGHI
*/
	
import java.util.Scanner;
class Pattern57{
    public void star(int a){
		System.out.println("Pattern ");
	int i, j, k, s = 0;
		for (i = a; i >= 1; i--) {
			for (j = i - 1; j >= 1; j--) {
				System.out.print(" ");
			}
			for (k = 0; k <= s; k++) {
				System.out.print((char) (k + 65));

			}
			s = s + 2;
			System.out.println();
    	}
    }
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern57 obj=new Pattern57();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	