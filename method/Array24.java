//all distinct number
import java.util.Scanner;
class Array24{
   public void distinct(int a[]){
	int i,j;
	System.out.println("all Distinct element");
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a.length; j++) {
				if (a[i] == a[j])
					break;
			}
			if (i == j)
				System.out.println(a[i] + " ");
		}
    }
}	
class NumberTest {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array24 obj=new Array24();
		System.out.println("limit of array ");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		obj.distinct(a);
    }
}	