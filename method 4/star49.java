/*
ABCDE
A__D
A_C
AB
A
*/	
import java.util.Scanner;
class Pattern49{
    public void star(int a){
		System.out.println("Pattern ");
      int i, j, k, c;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
                for (k = 1; k <= i; k++) {
				    if (i == 4 && (k == 2 || k == 3))
					    System.out.print("_");
				    else if (i == 3 && k == 2)
					    System.out.print("_");
				    else
					System.out.print((char) (k + 64));
			    }
            System.out.println();
		}
 	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern49 obj=new Pattern49();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	