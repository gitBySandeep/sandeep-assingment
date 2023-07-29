/*
1
12
123
1234
123
12
1
*/	
import java.util.Scanner;
class Pattern71{
    public void star(int a){
		System.out.println("Pattern ");
				int i, c = 1;
		for (i = 1; i <= a; i++) {
			for (int sp = a-1; sp >= c; sp--) {
				System.out.print(" ");
			}
			c++;
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

		for (i = a-1; i >= 1; i--) {
			for (int sp = a-1; sp >= i; sp--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println(" ");
		}	
    }
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern71 obj=new Pattern71();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	