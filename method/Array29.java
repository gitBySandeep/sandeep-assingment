//insert element
import java.util.Scanner;
class Array29{
   public void Linear(int x[],int m,int k){
	int i,j;
      for( i = x.length-1; i>=m-1; i--){
          x[i+1] = x[i];
      }  
      System.out.println("After Down Shifting...");
      x[m-1] = k;
	  for( i=0; i<x.length+1; i++){
        System.out.print(" "+x[i]);
    }
	}
}	
class NumberTest {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array29 obj=new Array29();
		System.out.println("limit of array ");
		n = sc.nextInt();
		int x[] = new int[n+1];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
      System.out.println("Enter Position and Element to be insert");
      int m = sc.nextInt();
      int k = sc.nextInt();
		obj.Linear(x,m,k);
    }
}	

