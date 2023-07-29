//23) 1	9	25	49	81	…..

import java.util.Scanner;
class series8{
    public void num(int a){ 
    System.out.println("series of square ");
		for(int i=1;i<=a;i=i+2){
		System.out.println(i*i);
		}
	}
}

class NumberTest{
    public static void main(String[]args){
	     series8 obj=new series8();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	