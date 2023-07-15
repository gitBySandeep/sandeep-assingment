//20) 0	7	14	21	28	35	….
import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		
	    for(i=0;i<=n;i=i+7){
		    System.out.println(i);
		}
	}
}	