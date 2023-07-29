// Write a program to reverse the array.
import java.util.Scanner;
class Array31{
    public void num(int a[]){
        System.out.println("after reverse Array" );
   		    for (int i=a.length-1; i>=0; i--) {
			    System.out.println(a[i]);
		    } 	 

		}
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array31 obj=new Array31();
        System.out.println("limit of array ");
		n = sc.nextInt();
		int x[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
	    obj.num(x);
	}
}	
