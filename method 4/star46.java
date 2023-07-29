/*
1
10
101
1010
10101

*/	
import java.util.Scanner;
class Pattern46{
    public void star(int a){
		System.out.println("Pattern ");
        int i, j, sp;
		for (i = 1; i <= a; i++) {
			for (sp = 4; sp >= i; sp--) {
				System.out.print(" ");
			    }
			    for (j = 1; j <= i; j++) {
				    if (j % 2 == 0)
					    System.out.print(0);
				    else
					    System.out.print(1);
			}
			System.out.println();
		}    
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern46 obj=new Pattern46();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	