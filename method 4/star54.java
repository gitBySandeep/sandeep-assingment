/*
     X 
    X X 
   X__X
  X____X
 X X X X X

*/
	
import java.util.Scanner;
class Pattern54{
    public void star(int a){
		System.out.println("Pattern ");
			int i, j, k ;
		for (i = 1; i <= a; i++) {
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				if ((i == k || i == 5 || k == 1))
					System.out.print(" " + "X");
				else
					System.out.print(" " + "_");
			}

			System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern54 obj=new Pattern54();
		Scanner sc=new Scanner(System.in);
		obj.star(5);
		}
}	
	