//sum of two index
import java.util.Scanner;
class Array23{
   public int Zero(int a[]){
	int sum = 0;
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter first index to start sum");
		int k = sc.nextInt();

		System.out.println("enter last index to end sum");
		int m = sc.nextInt();

		for (int i = k; i <= m; i++) {
			sum = sum + a[i];
		}
    return sum;
	}
}	
class NumberTest {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array23 obj=new Array23();
		System.out.println("limit of array ");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int result=obj.Zero(a);
		System.out.println(result + "  " + "is total sum of indexes element");
    }
}