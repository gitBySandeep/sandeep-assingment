/*
1
22
333
4444
55555

*/	
import java.util.Scanner;
class Pattern41{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j, sp;
		for (i = 1; i <= a; i++) {
			for (sp = 4; sp >= i; sp--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {

				System.out.print(i);
			}
			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern41 obj=new Pattern41();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	