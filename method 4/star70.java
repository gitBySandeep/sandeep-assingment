/*
1
12
123
1234
123
12
1
*/	
import java.util.Scanner;
class Pattern70{
    public void star(int a){
		System.out.println("Pattern ");
			int i,c=a-1;
		for (i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		for (i = 1; i <= a-1; i++) {
			for (int j = 1; j <=c; j++) {
				System.out.print(j);
			}
			c--;
			System.out.println(" ");
	}
  }
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern70 obj=new Pattern70();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	