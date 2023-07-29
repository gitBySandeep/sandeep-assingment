//48) WAP to find out the factors of all the numbers between two entered numbers
import java.util.Scanner;
class Factor{
    public void num(int a,int b){
	int i,j;	
        for( i=a;i<=b;i++){
	        System.out.println("factor of :"+i);
	        for( j=1;j<=i;j++){
			if(i%j==0)
		        System.out.println(j);
	        }
	    }	
	}	
}	

class NumberTest{
    public static void main(String[]args){
	    Factor obj=new Factor();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		System.out.println("enter number ");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	
