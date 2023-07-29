/*Wap to fibbonacci series
0,1,1,2,3,5,8,13,21,24*/
import java.util.Scanner;
class Fibonacci{
    public void num(int n){
		System.out.println("Output");
		int i,n1,n2,n3;
		n1=0;
		n2=1;	
		for(i=1;i<=n;i++){
 		    System.out.println(n1);
            n3=n1+n2;
			n1=n2;
			n2=n3;
		} 
    }
}	
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		Fibonacci obj=new Fibonacci();
		obj.num(n);
	}
}