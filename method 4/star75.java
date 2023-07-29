/*
*
*_* 
*___* 
*_____*
*___* 
*_*
*
*/	
import java.util.Scanner;
class Pattern75{
    public void star(int a){
		System.out.println("Pattern ");
	   	int i, j, k, s = 1, m = 5;
		for (i = 1; i <= 7; i = i + 2) {
			for (j = 4; j >= s; j--) {
				System.out.print(" ");
			}
			s++;
			for (k = 1; k <= i; k++) {
				if (k == 1 || i == k)
					System.out.print("*");
				else
					System.out.print("_");
			}
			System.out.println();

		}
		for (i = 5; i >= 1; i = i - 2) {
			for (j = 7; j >= i; j = j - 2) {
				System.out.print(" ");
			}

			for (k = 1; k <= i; k++) {
				if (k == 1 || i == k)
					System.out.print("*");
				else
					System.out.print("_");
			}
			System.out.println();
		}			
    }
}		
class NumberTest{
    public static void main(String[]args){
	    Pattern75 obj=new Pattern75();
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter row ");
		//int a=sc.nextInt();
	    obj.star(4);
		}
}	
	