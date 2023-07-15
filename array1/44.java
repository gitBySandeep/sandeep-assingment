
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		int n, m,k;
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
		
		
		System.out.println("enter the check number in array ");
		k = sc.nextInt();
		
		boolean flag1=false;
		boolean flag2=false;
		for (i = 0; i < n; i++){
		    if(a[i]==m)
            flag1=true;
			
		    if(a[i]==k)
            flag2=true;
			
			if(flag1 && flag2)
             break;
			 
		}	 
		if(flag1&&flag2){
		System.out.println("element are found ");
        }else if(flag1){
		System.out.println(" first element are  found but second not found ");
		}else if(flag2){
		System.out.println(" first element are not found but  second found ");
		}
		else{
			System.out.println("Both are not found");
		}	
    }
}