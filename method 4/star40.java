/*
1
12
123
1234
12345

*/	
import java.util.Scanner;
class Pattern40{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j, sp;
		for (i = 1; i <= 5; i++) {
			for (sp = 4; sp >= i; sp--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern40 obj=new Pattern40();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	