//hcf
import java.util.Scanner;

class Add {
	public static void main(String[] args) {
		int  i = 1, hcf = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int n = sc.nextInt();
		System.out.println("enter any number");
		int n1 = sc.nextInt();
		int max = n > n1 ? n : n1;
		for (i = 2; i <= max; i++) {
            if (n % i == 0 && n1 % i == 0)
			 	hcf = i;
			if(hcf>1)
				break;
	        }
		System.out.println("HCF of the number " + hcf);
    }
}
