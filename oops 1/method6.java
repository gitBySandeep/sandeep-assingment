//7) WAP to check whether entered number is prime or not.
import java.util.Scanner;
class prime{
    public void num(int a){
	    int i;   
		for(i=2;i<=a/2;i++){
 		    if(a%i==0){
	            break;	 
            }
	    } 
		if(i>(a/2)){
	            System.out.print("number is prime"+a);
	        } 
		else{
	           System.out.print("number is not prime"+a);
            }
	}
}

	
class NumberTest{
    public static void main(String[]args){
	    prime obj=new prime();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
	}
}	