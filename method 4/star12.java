/*
1
01
101
0101
10101

*/
import java.util.Scanner;
class Pattern12{
    public void star(int a){
		int i,j;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=1;j<=i;j++) {
			if((i+j)%2==0)
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
	    Pattern12 obj=new Pattern12();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	