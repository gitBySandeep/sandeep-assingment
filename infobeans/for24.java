//24. WAP in C to display the n terms of harmonic series and
  // their sum
   //1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sum=0;
        System.out.println("enter number");
		int n=sc.nextInt();
		  
		for(float i=1;i<=n;i++){  
			sum=(sum+(1f/i));
		}
        	System.out.println(sum);
	}
}	