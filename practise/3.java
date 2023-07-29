//Wap to sum of num will greater than 100 and less than 200 there are divisible by 7
import java.util.Scanner;
class greater{
    public int num(){
	    int i,sum=0;
		for(i=101;i<=199;i++){
		    if(i%7==0){
		    sum=sum+i;
	        }
	    }
    return sum;
	}
}	
 
class Add {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		greater obj=new greater();
	    int result=obj.num();
		System.out.println("Sum of integer"+result);
	}
}		