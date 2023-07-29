//12) WAP to print odd numbers upto N
import java.util.Scanner;
class oddNumber{
    public void odd(int a){ 
    System.out.println("odd number");
	for(int i=a;i>=0;i--){
	    if(i%2==1)
		System.out.println(i);
		} 	
	}
}

	
class NumberTest{
    public static void main(String[]args){
	    oddNumber obj=new oddNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.odd(a);
		}
}	