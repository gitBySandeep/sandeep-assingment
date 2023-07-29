/*
A B C D E
A B C D
A B C
A B
A

*/	
import java.util.Scanner;
class Pattern65{
    public void star(int a){
		System.out.println("Pattern ");
	int i, c = 69;
		for (i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 65; j <= c; j++) {
				System.out.print(" " + (char) (j));
			}
			c--;
			System.out.println(" ");
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern65 obj=new Pattern65();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	