/*
A
BCD
EFGHI
JKLMNOP
*/	
import java.util.Scanner;
class Pattern38{
    public void star(int a){
		System.out.println("Pattern ");
		int count = 65, i, j;
		for (i = 1; i <= a; i++) {
			for (j = 1; j <= i * 2 - 1; j++) {
				System.out.print((char) (count));
				count++;
			}
            System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern38 obj=new Pattern38();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	