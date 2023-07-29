//59) WAP to find out the sum of all integer between 100 and 200 which are divisible by 9
import java.util.Scanner;
class SumofNumber{
    public void num(){
		int i, s=0, t=0;
        for (i = 100; i <= 200; i++) {
			if (i % 9 == 0) {
				s = s + i;
				t = s;
			}
		}	
		System.out.println(+t + " sum of integer 100 to 200 which is divisible by 9");
	}
}	
	
class NumberTest{
    public static void main(String[]args){
	    SumofNumber obj=new SumofNumber();
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter number ");
		//int a=sc.nextInt();
		//System.out.println("enter number ");
		//int b=sc.nextInt();
		obj.num();
	}
}	