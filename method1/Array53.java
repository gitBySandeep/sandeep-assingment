//35. Write a java program to implement selection sort algoritm
	
import java.util.Scanner;
class Array53{
    public void num(int a[]){
			int i,j;
		System.out.println("selection sorting");
		for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
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
		Array53 obj=new Array53();
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
	
		    
