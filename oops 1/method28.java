//27) *	#	*	#	*	#	*	#	*	…….

import java.util.Scanner;
class series13{
    public void num(int m){ 
    System.out.println("series of cube");
		
 		int x,y,z,p,a=0,b=1,c=2,d=3; 
		for(int i=1;i<=m;i++){   
	        x=++a;
			y=++b;
			z=++c;
			p=++d;
	        System.out.println(a);
			System.out.println(b);
		    System.out.println(c);
			System.out.println(d);
			System.out.println("hello");
			a=a+4;
			b=b+4;
			c=c+4;
			d=d+4;
		}
	}
}
	
class NumberTest{
    public static void main(String[]args){
	     series13 obj=new series13();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int m =sc.nextInt();
		obj.num(m);
		}
}	