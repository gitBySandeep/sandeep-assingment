//9) WAP to print N odd numbers.
import java.util.Scanner;
class oddNumber{
    public void odd(int a){ 
    System.out.println("even number");
	for(int i=0;i<=a;i++){
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