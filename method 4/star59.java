/*
1
1*1
1***1
1*****1
111111111

*/
	
import java.util.Scanner;
class Pattern59{
    public void star(int a){
		System.out.println("Pattern ");
			int i, c = 1;
		for (i = 1; i <= 9; i = i + 2) {
			for (int j = 4; j >= c; j--) {
				System.out.print(" ");
			}
			c++;
			for (int j = 1; j <= i; j++) {
				if ((i == 9 || j == 1 || j == i))
					System.out.print("1");
				else
					System.out.print("*");
			}
			System.out.println(" ");
		}
    }
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern59 obj=new Pattern59();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	