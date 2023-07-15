//WAP to print all prime number from 101 to 199 
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,count=0;
		 
		for(i=101;i<=199;i++){
		    for(j=2;j<i;j++){
			    if(i%j==0)
				count=0;
				else
				count=1;
			}
		}
        if(count==1)
            System.out.println("prime number"+i);		
	}
}	