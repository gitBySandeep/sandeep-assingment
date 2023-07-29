//22) 1	8	27	64	125	…..

import java.util.Scanner;
class series7{
    public void num(int a){ 
    System.out.println("series of cube ");
		for(int i=1;i<=a;i++){
		System.out.println(i*i*i);
		}
	}
}

class NumberTest{
    public static void main(String[]args){
	     series7 obj=new series7();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	