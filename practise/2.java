//Wap to check if sales greater than 10000 to elligible for bonus of 20%
import java.util.Scanner;
class Sales{
    public void cost(int a){
		if(a>10000){
		double b=(0.2*a);
		System.out.println("bonus"+b);	
		System.out.println("elligible for bonus"+(a-b));
        }
		else{
		System.out.println(" not elligible for bonus");
        }
	}
}	
 
class Add {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter cost");
		int c=sc.nextInt();
		Sales rohan=new Sales();
		rohan.cost(c);
	}
}		