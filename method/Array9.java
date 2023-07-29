//print positive,negetive,zero,odd,even;
import java.util.Scanner;
class Array9{
   public void product(int a[]){	
	 int sum;
		for (int i = 0; i <a.length; i++) {
			if (a[i] > 0)
				System.out.println("Number is positive" + a[i]);
			if (a[i] < 0)
				System.out.println("Number is negetive" + a[i]);
			if (a[i] % 2 == 0)
				System.out.println("Number is even" + a[i]);
			else
				System.out.println("Number is odd" + a[i]);
			if (a[i] == 0)
				System.out.println("Number is zero" + a[i]);
		}
		System.out.println();
	}	
}
		
class NumberTest{
    public static void main(String[]args){
	    Array9 obj=new Array9();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int a=sc.nextInt();
		int x[]=new int[a];
		System.out.println("enter number");
		for (int i =0; i<a; i++) {
			x[i] = sc.nextInt();
        }
	    obj.product(x);		
	}
}	