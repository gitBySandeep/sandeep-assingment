//49) WAP to find out all the perfect numbers between two entered numbers
import java.util.Scanner;
class Perfect{
    public void num(int a,int b){
	    int i, j, t = 0;
		for (i=a; i<=b; i++) {
			for (j=1; j<=i/2; j++) {
				if (i % j == 0)
					t = t + j;
			    }
			if (i == t)
				System.out.println(i + "is perfect num");
			t = 0;
		}
    }	
}	
	

class NumberTest{
    public static void main(String[]args){
	    Perfect obj=new Perfect();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		System.out.println("enter number ");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	
