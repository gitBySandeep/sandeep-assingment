// WAP to reverse to given number-123
import java.util.Scanner;
class Reverse{
    public void num(int n){
        int rev=0,r;    
		while(n>0){
		    r=n%10;
            n=n/10;
            rev=10*rev+r;
        }
     	System.out.println("rev number="+rev);	

   }
}	
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Reverse obj=new Reverse();
		obj.num(123);
	}
}