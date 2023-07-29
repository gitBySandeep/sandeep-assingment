//35. Write a java program to implement Bubble sort algoritm
		
import java.util.Scanner;
class Array54{
    public void num(int a[]){
			int i,j;
		System.out.println("bubble sorting");
		for(i=0;i<a.length;i++){
            for(j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
				 a[j]=a[j]+a[j+1] ;
				a[j+1]=a[j]-a[j+1];
				a[j]=a[j]-a[j+1];
			    }
			}
			System.out.println(a[i]);
	    }
    }
}	
class NumberTest{
	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		Array54 obj=new Array54();
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
	
		    
