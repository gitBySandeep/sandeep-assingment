/*
1
12
1 3
1  4
12345
*/
import java.util.Scanner;
class Pattern19{
    public void star(int a){
		int i,j;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=1;j<=i;j++) {
                if(i==j||j==1||i==a)			
			    System.out.print(j);
			    else
				System.out.print(" ");
	        }   
		System.out.println("");	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern19 obj=new Pattern19();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	