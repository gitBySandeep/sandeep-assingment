//34) WAP to check whether entered number is perfect or not
import java.util.Scanner;
class perfectno{
    public void num(int a){
    int i,sum=0,c=a;
    for( i=1;i<a;i++){
     	if(a%i==0){
	       sum=sum+i;
		}	
	}	
	    if(c==sum){
            System.out.println("perfect number"+c);
	    }	
	    else{
	        System.out.println("not a perfect number"+c);
        }
	}
}	

class NumberTest{
    public static void main(String[]args){
	     perfectno obj=new perfectno();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	
