//20) 0	7	14	21	28	35

import java.util.Scanner;
class series5{
    public void num(int a){ 
    System.out.println("series ");
		for(int i=0;i<=a;i=i+7){
		    System.out.println(i);
		}
	}
}

class NumberTest{
    public static void main(String[]args){
	    series5 obj=new series5();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	