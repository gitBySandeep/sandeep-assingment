/*
1
12
123
1234
12345
*/
import java.util.Scanner;
class Pattern8	{
    public void star(int a){
		int i,j;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=1;j<=i;j++) {
	            System.out.print(j);
	           	}   
			System.out.println("");	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern8 obj=new Pattern8();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	