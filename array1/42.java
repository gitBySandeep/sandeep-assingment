//linear search
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();
        
		int i, j;

		int a[] = new int[n];

		System.out.println("element of first array");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter the check number in array ");
		m = sc.nextInt();
		
		boolean flag=false;
		for (i = 0; i < n; i++){
		    if(a[i]==m)
            flag=true;
             break;
		}	 
		if(flag)
		System.out.println("element are found ");
        else
		System.out.println("element are not found");
    }
}