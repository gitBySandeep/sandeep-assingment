// 20. WAP to print all prime number from 101 to 199
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int k=101;k<=199;k++){  
        int n=k;
		int count=0;
		for(int i=1;i<=n;i++){
		if(n%i==0){
			count++;
		}
        }		
        if(count==2)
        {		
		    System.out.println("its prime  :"+n);
		}
		}
	}
}	