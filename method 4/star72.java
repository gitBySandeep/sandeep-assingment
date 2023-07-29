/*
1
1 2
1  3
1   4
1  3
1 2
1
*/	
import java.util.Scanner;
class Pattern72{
    public void star(int a){
		System.out.println("Pattern ");
			int i, c = 3;
		for (i 	= 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i == 3 && j == 2) || (i == 4 && j >= 2 && j <= 3))
					System.out.print(" ");
				else
					System.out.print(j);
			}
			System.out.println(" ");
		}
		for (i = 1; i <= a; i++) {
			for (int j = 1; j <= c; j++) {
				if ((i == 1 && j == 2))
					System.out.print(" ");
				else
					System.out.print(j);
			}
			c--;
			System.out.println(" ");
		}
			
    }
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern72 obj=new Pattern72();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	