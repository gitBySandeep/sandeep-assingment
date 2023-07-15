//19. WAP to calculate the sum of series 1/1! + 2/2! + 3/3!.......n\n! 
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float fact=1;
        System.out.println("enter number");
		int n=sc.nextInt();
		float sum=0;
            for(int i=1;i<=n;i++){
			fact=fact*i;
			float a=i/fact;
			sum=sum+a;
		}
        	System.out.println(sum);
	}
}	