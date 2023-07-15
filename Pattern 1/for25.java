//25) 1	27	125	343	………
import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		
	    for(i=1;i<=n;i=i+2){
		    System.out.println(i*i*i);
		}
	}
}	