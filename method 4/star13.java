/*
1
23
456
78910
*/
import java.util.Scanner;
class Pattern13{
    public void star(int a){
		int i,j,b=1;
		System.out.println("Pattern ");
        for (i=1; i<=a; i++) {
		    for (j=1;j<=i;j++) {
			    System.out.print(b);
				b++;
	        }   
			System.out.println("");	
		}    
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern13 obj=new Pattern13();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	