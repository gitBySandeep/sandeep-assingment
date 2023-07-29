/*
     1               
    101            
   10101         
  1010101           
 101010101   
10101010101
*/
import java.util.Scanner;
class Pattern80{
    public void star(int a){
	System.out.println("Pattern ");
	int i, j, k, c =1;
		for (i = 1; i <= a; i++) {
			for (j = a-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				if (k % 2 == 1)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println("");
		}
	}
}		
class NumberTest{
    public static void main(String[]args){
	    Pattern80 obj=new Pattern80();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
	}
}	
