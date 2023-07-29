//print Armstrong 
import java.util.Scanner;
class Armstrong{
	public void num(int n){
	int rev=0,r,sum=0,c=n;
	while(n>0){
    	r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}
	if(c==sum)
	System.out.println("its Armstrong number");
	else
	System.out.println("its not Armstrong number");
   }
}   
	
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		Armstrong sandeep=new Armstrong();
		sandeep.num(n);
	}
}	
	