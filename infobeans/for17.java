//17. WAP to calculate x^y (x to the power y)

import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n,n1,count=0;
		System.out.print("enter  number ");
		n = sc.nextInt();
        System.out.print("enter second number ");
		n1 = sc.nextInt();
        int r=1;
		
		while(n1!=0){
		r=r*n;
		--n1;
	    }
            System.out.println("result ="+r);
	}
}	