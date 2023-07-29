//43) WAP to convert binary number into decimal number
import java.util.Scanner;
class Binary{
    public void num(int a){
		int i,c=0,sum=0,pow=1,r=0;
		System.out.println("decimal number");
		while(a>0){
		   r=a%10; 
			a=a/10;
			c++;
		for( i=1;i<c;i++){	
		 pow=pow*2;
		}
        if(r==1)
		sum=sum+pow;
		pow=1;
		} 
		System.out.println(sum);
    }	
}	

class NumberTest{
    public static void main(String[]args){
	    Binary obj=new Binary();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
	}
}