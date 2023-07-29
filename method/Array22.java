// how many time zero in array
import java.util.Scanner;
class Array22{
    public void Zero(int a[]){
	    int count = 0;
		System.out.println("number of zero in array elements");
		for (int i = 0; i <a.length; i++) {
			if (a[i] == 0)
				count++;
		}
		System.out.println(count);
	}
}	
class NumberTest {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array22 obj=new Array22();
		System.out.println("limit of array ");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		obj.Zero(a);
    }
}