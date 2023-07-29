/*

     1
    212
   32123
  4321234
 543212345
*/
import java.util.Scanner;
class Pattern77{
    public void star(int a){
		System.out.println("Pattern ");
	int i, j, k;
		for (i = 1; i <= a; i++) {
			for (j = a-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (j = 2; j <=i; j++) {
				System.out.print(j);
			}
        System.out.println("");
		}
	}
}		
class NumberTest{
    public static void main(String[]args){
	    Pattern77 obj=new Pattern77();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	
	