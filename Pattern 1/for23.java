//23) 1	9	25	49	81	
import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		
	    for(i=1;i<=n;i=i+2){
		    System.out.println(i*i);
		}
	}
}	