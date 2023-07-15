//18) 1	2	2	4	8	32	…… n terms
import java.util.Scanner;
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
	   	System.out.println("enter number");
		int n=sc.nextInt();
		int pro=1;
		int b=2;
		int a=1;
		System.out.println (a);
		System.out.println (b);
		
	    for(int i=0;i<=n;i++){
			pro=a*b;
		    System.out.println (pro);
		        a=b;
				b=pro;
		}   	   
	}
}