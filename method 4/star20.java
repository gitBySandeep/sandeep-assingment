/*
A
AB
A C
A  D
ABCDE
*/
import java.util.Scanner;
class Pattern20{
    public void star(int a){
		int i,j,b=65,c=65;
		System.out.println("Pattern ");
        for (i=1;i<=a;i++) {
		    for (j=65;j<=b;j++) {
                if(j==65||j==b||i==a)			
			    System.out.print((char)(j));	
			    else
				System.out.print(" ");
	        }   
		b++;	
		System.out.println("");	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern20 obj=new Pattern20();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	