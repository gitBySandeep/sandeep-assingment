//18) 1	2	2	4	8	32	…… n terms

import java.util.Scanner;
class series3{
    public void num(int a){ 
    System.out.println("series of fabonacci	");
		int pro=1,c=2,b=1;
		System.out.println (b);
		System.out.println (c);
		
	    for(int i=0;i<=a;i++){
			pro=b*c;
		    System.out.println (pro);
		        b=c;
				c=pro;
		}
	}
}

class NumberTest{
    public static void main(String[]args){
	     series3 obj=new series3();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	