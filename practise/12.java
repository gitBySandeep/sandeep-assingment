//print prime number
import java.util.Scanner;
class Prime{
    public void num(int n){
	int i;
	boolean flag=false;
	for(i=2;i<=n/2;i++){
	   if(n%i==0){
	        flag=true;
			break;
	    }
	}
	if(flag){
	System.out.println("its not Prime number");
	}else{
	System.out.println("Prime number");
	}
	}
}
	
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		Prime obj=new Prime();
		obj.num(n);
	}
}