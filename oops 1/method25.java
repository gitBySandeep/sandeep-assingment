//25) 1	27	125	343	…………

import java.util.Scanner;
class series10{
    public void num(int a){ 
    System.out.println("series of cube");
		for(int i=1;i<=a;i=i+2){
		System.out.println(i*i*i);
		}
	}
}

class NumberTest{
    public static void main(String[]args){
	     series10 obj=new series10();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	