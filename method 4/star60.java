/*
A
B B
C  C
D    D
EEEEEEEEE
*/	
import java.util.Scanner;
class Pattern60{
    public void star(int a){
		System.out.println("Pattern ");
	char i, c = 'A', b = 'A';
		for (i = 'A'; i <= 'I'; i += 2) {
			for (char j = 'D'; j >= c; j--) {
				System.out.print(" ");
			}
			c++;
			for (char j = 'A'; j <= i; j++) {
				if ((i == 'I' || j == 'A' || j == i))
					System.out.print(b);
				else
					System.out.print(" ");
			}
			b++;
			System.out.println(" ");
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern60 obj=new Pattern60();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	