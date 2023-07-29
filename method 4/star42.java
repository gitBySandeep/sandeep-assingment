/*
5
44
333
2222
11111
*/	
import java.util.Scanner;
class Pattern42{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j, sp;
		for (i = 5; i >= 1; i--) {
			for (sp = i; sp >= 2; sp--) {
                System.out.print(" ");
			}
			for (j = 5; j >= i; j--) {
                System.out.print(i);
			}
			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern42 obj=new Pattern42();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	