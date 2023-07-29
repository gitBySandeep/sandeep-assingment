/*
A
AB
ABC
ABCD
ABCDE

*/	
import java.util.Scanner;
class Pattern43{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j, sp;
		for (i = 65; i <= 69; i++) {
			for (sp = i; sp < 68; sp++) {
                System.out.print(" ");
			}
			for (j = 65; j <= i; j++) {
                System.out.print((char) (j));
			}
			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern43 obj=new Pattern43();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	