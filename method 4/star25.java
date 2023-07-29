/*
1
10
1 1
1  0
10101
*/
import java.util.Scanner;
class Pattern25{
    public void star(int a){
		int i,j;
		System.out.println("Pattern ");
        for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				if (j == i || i
				== 5 || j == 1) {
					if (j % 2 == 0)
						System.out.print("0");
					else
						System.out.print("1");
				} else
					System.out.print(" ");
			}
			System.out.println("");
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern25 obj=new Pattern25();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	