/*
123456789
1     7
1   5
1 3
1
*/	
import java.util.Scanner;
class Pattern67{
    public void star(int a){
		System.out.println("Pattern ");
				int i;
		for (i = a; i >= 1; i = i - 2) {
			for (int j = a; j >= i; j = j - 2) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				if (i == a || j == i || j == 1)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
    }
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern67 obj=new Pattern67();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	