/*
1
10
101
1010
10101
*/
import java.util.Scanner;
class Pattern17{
    public void star(int a){
		int i,j;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=1;j<=i;j++) {
                if(j%2==1)			
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
	    Pattern17 obj=new Pattern17();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	