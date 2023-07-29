/*
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1

*/	
import java.util.Scanner;
class Pattern66{
    public void star(int a){
		System.out.println("Pattern ");
		int i, c = a;
		for (i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= c; j++) {
				System.out.print(" " + c);
			}
			c--;
			System.out.println(" ");
		}

	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern66 obj=new Pattern66();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	