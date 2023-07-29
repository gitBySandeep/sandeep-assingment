/*
55555
4444
333
22
1

*/	
import java.util.Scanner;
class Pattern48{
    public void star(int a){
		System.out.println("Pattern ");
    int i, j, k;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			    for (k = 1; k <= i; k++) {
                    System.out.print(i);
			}
        System.out.println();
		}
	
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern48 obj=new Pattern48();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	