//12) WAP to print even numbers upto N
import java.util.Scanner;
class evenNumber{
    public void even(int a){ 
    System.out.println("even number");
	for(int i=a;i>=0;i--){
	    if(i%2==0)
		System.out.println(i);
		} 	
	}
}

	
class NumberTest{
    public static void main(String[]args){
	    evenNumber obj=new evenNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.even(a);
		}
}	