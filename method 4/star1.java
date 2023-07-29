//*****
import java.util.Scanner;
class Pattern1{
    public void star(int a){
		int i;
        for (i = 1; i <= a; i++) {
        	System.out.print("*");
	    }
	}	
}	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern1 obj=new Pattern1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
	}
}	