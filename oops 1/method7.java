//8) WAP to print Fibonacci series.
import java.util.Scanner;
class fibonacci{
    public void num(int a){ 
	int i,n1,n2,n3;
		n1=0;
		n2=1;	
		for(i=1;i<=a;i++){
 		    System.out.println(n1);
            n3=n1+n2;
			n1=n2;
			n2=n3;
		} 	
	}
}

	
class NumberTest{
    public static void main(String[]args){
	    fibonacci obj=new fibonacci();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
	}
}	