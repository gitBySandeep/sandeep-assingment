/*32. Given two arrays of integers A and B of sizes M and N respectively. Write a Write a c program, 
which will produce a third array named C. such that the following sequence is followed. 
*/	
	
import java.util.Scanner;
class Array52{
    public void num(int a[],int b[],int c[]){
	int i,j;
		for(i=0;i<c.length;i++){
			if(i<a.length){
			c[i]=a[i];
		}
        	else{ 
			
			c[i]=b[i-a.length];
		}		
		}	
		
		System.out.println("after merge two array arrange ascending order");
		for(i=0;i<c.length;i++){
            for(j=i+1;j<c.length;j++){
				if(c[i]>c[j]){
				int temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			    }
			}
			System.out.println(c[i]);
	    }
	
	System.out.println("after arrange even and Odd order");
	    for(i=0;i<c.length;i++){
            if(c[i]%2==0)
		System.out.print(c[i]+" ");		
		}	
		for(i=0;i<c.length;i++){
            if(c[i]%2==1)
		System.out.print(c[i]+" ");		
		}			
    }
}	
class NumberTest{
	public static void main(String[] args) {
		int n,m;
		Scanner sc = new Scanner(System.in);
		Array52 obj=new Array52();
        System.out.println("size of two array ");
		n = sc.nextInt();
		m = sc.nextInt();
        int x[] = new int[n];
 		int y[] = new int[m];
 		int z[] = new int[n+m];
	    
		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
		
		System.out.println("element of second array");
		for (int i = 0; i < m; i++) {
			y[i] = sc.nextInt();
        }
    obj.num(x,y,z);
	} 
}  
	
		    
