/*
*         *
*      *
  *  *
    *
*  *
*      *
*         *

*/
import java.util.Scanner;
class Pattern81{
    public void star(int a){
	System.out.println("Pattern ");
	 int i, j, k, c = 1;
          for (i = 1; i <= a; i++) {
               for (j = 1; j <= a; j++) {
                    if ((i == j || i + j ==a+1))
                         System.out.print("*");
                    else
                         System.out.print(" ");
                }
            System.out.println("");
        }
	}
}		
class NumberTest{
    public static void main(String[]args){
	    Pattern81 obj=new Pattern81();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
	}
}	
