//17) 1 	2	 4	 7	 11	 16 	…… n terms
import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n,a=1,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		
	    for(i=1;i<=n;i++){
		        System.out.println (a);
				a=a+b;
				b++;
        }      
	}
}