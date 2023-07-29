//21) 1,	4,	9,	16,	25	…..

import java.util.Scanner;
class series6{
    public void num(int a){ 
    System.out.println("series of square");
		for(int i=1;i<=a;i++){
		System.out.println(i*i);
		}
	}
}

class NumberTest{
    public static void main(String[]args){
	     series6 obj=new series6();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	