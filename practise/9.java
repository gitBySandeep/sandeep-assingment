//check given number is positive or negetive
import java.util.Scanner;
class Number{
    public void num(int n){
		if(n>0){
		System.out.println("Positive number");
		}
		if(n<0){
		System.out.println("negetive number");
		} 
    }
}	
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		Number obj=new Number();
		obj.num(n);
	}
}