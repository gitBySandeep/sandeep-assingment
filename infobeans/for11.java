//11 WAP to calculate the sum of given series 1 - 2 + 3 - 4 + 5 - 6................n terms 
import java.util.Scanner;
class Test{
	public static void main(String []args){
		Scanner sc=new Scanner (System.in);
		int n,i=1;
		System.out.print("enter any number");
		n=sc.nextInt();
		
		while(i<=n){
		    if(i%2==0){
			System.out.println((-i));
			}
		else{
            System.out.println(i);		
		    }
			i++;
        }
		
 	}
}	
		