/*
1
11
1*1
1**1
11111

*/	
import java.util.Scanner;
class Pattern44{
    public void star(int a){
		System.out.println("Pattern ");
	int i, j, sp;
		for (i = 1; i <= 5; i++) {
			for (sp = 4; sp >= i; sp--) {
                System.out.print(" ");
			    }
			    for (j = 1; j <= i; j++) {
				    if ((i == 5 || j == i || j == 1))
					    System.out.print("1");
				    else
					    System.out.print("*");
			}
            System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern44 obj=new Pattern44();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	