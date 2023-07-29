//peak element
import java.util.Scanner;
class Array30{
    public int num(int a[]){
        boolean flag=false;
		System.out.println("output");
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i] > a[i - 1] && a[i] > a[i + 1])
				flag=true;
			    break;
		}
		if(flag==true)
			return 1;
		else
        return 0;	
	}
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array30 obj=new Array30();
        System.out.println("limit of array ");
		n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
        }
		int number=obj.num(a);
		
		if (number==1)
			System.out.println("big element is found so generate 1");
		else
			System.out.println(" big element is not found so generate 0");
    }
}	
