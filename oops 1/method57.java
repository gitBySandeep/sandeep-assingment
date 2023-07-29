//57) WAP to print all the prime numbers between two entered numbers
import java.util.Scanner;
class PrimeNumber{
    public void num(int a,int b){
		int i, j;
		while (a < b) {
			boolean take = false;
			for (i = 2; i <= a / 2; i++) {
				if (a % i == 0) {
					take = true;
					break;
				}
				if (take)
					System.out.println(a+ "is a prime number ");
				++a;
			}
		}	
	}
}	
	
class NumberTest{
    public static void main(String[]args){
	    PrimeNumber obj=new PrimeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		System.out.println("enter number ");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	