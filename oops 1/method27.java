//27) *	#	*	#	*	#	*	#	*	…….

import java.util.Scanner;
class series12{
    public void num(int a){ 
    System.out.println("series ");
		for(int i=1;i<=a;i++){
		if(i%2==0)
		System.out.println("#");
		else
		System.out.println("*");
		}
	}
}
	
class NumberTest{
    public static void main(String[]args){
	     series12 obj=new series12();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	