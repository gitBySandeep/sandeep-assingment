//26) 0	8	64	216	…………


import java.util.Scanner;
class series11{
    public void num(int a){ 
    System.out.println("series of cube");
		for(int i=0;i<=a;i=i+2){
		System.out.println(i*i*i);
		}
	}
}
	
class NumberTest{
    public static void main(String[]args){
	     series11 obj=new series11();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	