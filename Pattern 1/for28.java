//28) 1	2	3	4	 Hello	6	7	8	9	Hello	11	12 ….
import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n,a=0,b=1,c=2,d=3,p,x,y,z;
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any n  umber");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
 		    
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