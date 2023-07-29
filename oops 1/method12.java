//13) WAP to print N natural numbers in reverse order
import java.util.Scanner;
class natural{
    public void num(int a){ 
    System.out.println("reverse natural number");
	for(int i=a;i>=1;i--){
	    System.out.println(i);
		} 	
	}
}

class NumberTest{
    public static void main(String[]args){
	     natural obj=new natural();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	