//WAP to print the fibonacci series 0 1 1 2 3 5 8 13..........................n terms
import java.util. Scanner;
class Test{
    public static void main(String[]args){
	    int i=1;
		int n;
		int n1=0;
		int n2=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
        n=sc.nextInt();
		
        while(n!=0){
            System.out.println("n1="+(n1));
            int n3=n1+n2;
		    n1=n2;
		    n2=n3;
			i++;
			n--;
	    }
    }
}