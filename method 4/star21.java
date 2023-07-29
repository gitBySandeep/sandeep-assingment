/*
a
bc
d f
g  j
klmno
*/
import java.util.Scanner;
class Pattern21{
    public void star(int a){
		int i,j,b=97;
		System.out.println("Pattern ");
        for (i=1;i<=a;i++) {
		    for (j=1;j<=i;j++) {
                if(j==1||j==i||i==a)			
			    System.out.print((char)(b));	
			    else
				System.out.print(" ");
			b++;	
	        }   
		
		System.out.println("");	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern21 obj=new Pattern21();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	