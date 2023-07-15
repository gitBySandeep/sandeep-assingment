//WAP to print 1 to n number
import java.util. Scanner;
class Test{
    public static void main(String[]args){
	    int i=1;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
        n=sc.nextInt();
		
        while(i<=n){
            System.out.println("i="+i);
            i++;
	    }
    }
}