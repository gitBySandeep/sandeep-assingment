//9) WAP to print N even numbers.
import java.util.Scanner;
class EvenNumber{
    public void even(int a){ 
    System.out.println("even number");
	for(int i=0;i<=a;i++){
	    if(i%2==0)
		System.out.println(i);
		} 	
	}
}

	
class NumberTest{
    public static void main(String[]args){
	    EvenNumber obj=new EvenNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.even(a);
	}
}	