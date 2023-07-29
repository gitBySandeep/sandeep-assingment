//24) 0	4	16	36	64	…..

import java.util.Scanner;
class series9{
    public void num(int a){ 
    System.out.println("series of square");
		for(int i=0;i<=a;i=i+2){
		System.out.println(i*i);
		}
	}
}

class NumberTest{
    public static void main(String[]args){
	     series9 obj=new series9();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	