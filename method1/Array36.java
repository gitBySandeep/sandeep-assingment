//Intersection and union of array
import java.util.Scanner;
class Array36{
    public void num(int a[],int b[],int c[] ){
    		int i,j;
        System.out.println("intersection of two array");
			for (i=0; i<a.length; i++){
				for (j=0; j<b.length;j++){
				if(a[i]==b[j]){
				System.out.println(a[i]);
				}
			}
		}	
        	System.out.println("union of two array");
		    for (i=0; i<c.length; i++){
			  	
				if(i<a.length){
				c[i]=a[i];
			}
			else{
				c[i]=b[i-a.length];
			}
		}	
			for (i=0; i<c.length; i++){
				for (j=0; j<i+1;j++){
				if(c[i]==c[j]){
					c[i]=c[j];
					break;
				}	
			}
			if(i==j)
			System.out.println(c[i]);
		}
    }	
} 	
class NumberTest{
	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		Array36 obj=new Array36();
        System.out.println("size of first array ");
		n = sc.nextInt();
        System.out.println("size of second array ");
		m = sc.nextInt();
        int x[] = new int[n];
		int a[] = new int[m];
		int b[] = new int[n+m];
 		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
		System.out.println("element of second array");
		    for (int j = 0; j<m; j++) {
		  	    a[j] = sc.nextInt();
		    }
        obj.num(x,a,b);
	}
}	
	
		