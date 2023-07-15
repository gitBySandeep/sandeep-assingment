// WAP to input a number and check it prime or not
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n,count=0;
		System.out.print("enter  number ");
		n = sc.nextInt();
        
		for(i=1;i<=n;i++){
		if(n%i==0){
			count++;
		}
        }		
        if(count==2&&n>1)
        {		
		    System.out.println("its prime");
		}
		else
		{		
		    System.out.println("its not prime");
		}
    }
}	