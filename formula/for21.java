//WAP to print the reverse of all number from 101 to 199
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,rev=0,r;
		
		for(i=101;i<=199;i++){
		    for(j=i;j>0;){
		        r=j%10;
                j=j/10;
                rev=10*rev+r;
            }
			System.out.println("reverse number"+rev);
			rev=0;
		}
	}
}	