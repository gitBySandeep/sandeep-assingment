//Lcm
import java.util.Scanner;

class Add {
	public static void main(String[] args) {
		int i,  lcm= 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int n = sc.nextInt();
		System.out.println("enter any number");
		int n1 = sc.nextInt();
		int 
		max = n >n1 ? n:n1;
		for (i = max;i>= max ;i++) {

			if (i % n == 0 && i % n1 == 0)
				lcm= i;
			if(lcm>=n&&lcm>=n1) 
				break;
		}
		System.out.println("lcm of the number " + lcm);

	}
}

