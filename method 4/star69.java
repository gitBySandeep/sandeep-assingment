/*
x
xx
xxx
xxxx
xxx
xx
x
*/	
import java.util.Scanner;
class Pattern69{
    public void star(int a){
		System.out.println("Pattern ");
					int i;
		for (i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("X");
			}
			System.out.println(" ");
		}
		for (i = a-1; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("X");
			}
			System.out.println(" ");
		}
    }
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern69 obj=new Pattern69();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	