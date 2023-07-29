//print leader element
import java.util.Scanner;
class Array25{
   public void Leader(int a[]){
	int i,j;
	int count = 0;
		System.out.println("all Leaders element");
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i]<=a[j])
					break;
			}
			if (j==a.length)
				System.out.println(a[i]);
		}
	}
}	
class NumberTest {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array25 obj=new Array25();
		System.out.println("limit of array ");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		obj.Leader(a);
    }
}	