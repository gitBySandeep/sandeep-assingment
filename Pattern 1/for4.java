//4)WAP to print table of a number.
import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,a,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		a=sc.nextInt();
		
		System.out.println("table ");
		for(i=1;i<=10;i++){
		    s=a*i;
            System.out.println (+s);			 
       }
	}
} 