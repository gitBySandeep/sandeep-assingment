/*
A
AB
A_C
A__D
ABCDE

*/	
import java.util.Scanner;
class Pattern45{
    public void star(int a){
		System.out.println("Pattern ");
            int i, j, sp, c = 1;
		        for (i = 65; i <= 69; i++) {
		        	for (sp = 4; sp >= c; sp--) {
				        System.out.print(" ");
                    }
			        c++;
			        for (j = 65; j <= i; j++) {
				        if ((i == 69 || j == i || j == 65))
					        System.out.print((char) (j));
				        else
					       System.out.print("_");
			}
            System.out.println();
		}
	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern45 obj=new Pattern45();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	
	