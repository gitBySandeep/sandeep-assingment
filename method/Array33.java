//Write a program to occurance of integer number in the array.
import java.util.Scanner;
class Array33{
    public int num(int a[],int b){
    	System.out.println("occurance of number in array" );
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==b)
			c++;
		}
		return c;
    }
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array33 obj=new Array33();
        System.out.println("limit of array ");
		n = sc.nextInt();
		int x[] = new int[n];
        System.out.println("enter number for occurance");
		int b=sc.nextInt();

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
	    int result=obj.num(x,b);
		System.out.println("occurance of"+" " +b+"  "+ "is :"+result);
	}
}	
