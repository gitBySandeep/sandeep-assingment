//1,8,27,64,125
import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		
	    for(i=1;i<=n;i++){
		    System.out.println(i*i*i);
		}
	}
}