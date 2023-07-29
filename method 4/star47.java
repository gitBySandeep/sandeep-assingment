/*
12345
1234
123
12
1

*/	
import java.util.Scanner;
class Pattern47{
    public void star(int a){
		System.out.println("Pattern ");
        int i, j, k;
		for (i = a; i >= 1; i--) {
			for (j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			    for (k = 1; k <= i; k++) {
                    System.out.print(k);
			}
            System.out.println();
		}    
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern47 obj=new Pattern47();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	