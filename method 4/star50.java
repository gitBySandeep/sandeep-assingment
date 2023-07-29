/*
11111
2222
333
44
5
*/	
import java.util.Scanner;
class Pattern50{
    public void star(int a){
		System.out.println("Pattern ");
 	int i, j, k, c = 1;
		for (i = a; i >= 1; i--) {
			for (j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
            for (k = 1; k <= i; k++) {
                System.out.print(c);
			}
			c++;
        System.out.println();
		}
	
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern50 obj=new Pattern50();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	