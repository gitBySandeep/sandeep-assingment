//37. Write a java progrtam to implement insertion sort algorithm 
			  	 
		
import java.util.Scanner;
class Array55{
    public void num(int a[]){
		int i,j,temp=0;
		for (i = 1; i < a.length; i++) {
		    temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp){
			a[j]=a[j-1];
			j=j-1;
		}
            a[j]=temp;
		}
		for (i = 0; i < a.length; i++) {
		    System.out.print(a[i]+" ");
		}
	
    }
}	
class NumberTest{
	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		Array55 obj=new Array55();
        System.out.println("size of  array ");
		n = sc.nextInt();
		int x[] = new int[n];
 		
		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }	
    obj.num(x);
	} 
}  
	