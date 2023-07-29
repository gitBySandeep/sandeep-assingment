/*
54321
5432
543
54
5
*/	
import java.util.Scanner;
class Pattern39{
    public void star(int a){
		System.out.println("Pattern ");
		int i, j;
		for (i = 1; i <= a; i++) {
			for (j = a; j >= i; j--) {
                System.out.print(j);
            }
			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern39 obj=new Pattern39();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	