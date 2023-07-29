//6) WAP to find out the factors of a number.
import java.util.Scanner;
class factorial{
    public void fact(int a){
	    System.out.println("factor of:"+a);
		for(int i=1;i<=a;i++){
        if(a%i==0)    
			System.out.println(i);			
		}
	}
}
	
class NumberTest{
    public static void main(String[]args){
	    factorial obj=new factorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.fact(a);
	}
}	