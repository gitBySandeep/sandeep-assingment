//Q.16 Rearrange array such that even positioned are greater than odd
import java.util.Scanner;
class Test {
	public static void main(String[]args){	
   	    int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("size of first array ");
		n=sc.nextInt();
		int i,j;
		 int temp=0;
		 
		int a[]=new int[n];
	  	
        System.out.println("element of first array");
		for( i=0;i<n;i++){
			a[i]=sc.nextInt(); 
        }
		
		System.out.println("Rearrange odd and even");
		for(  i=1;i<n;i++){
			if(i%2==0){
                if(a[i]>a[i-1]){         
	               temp=a[i-1];
				   a[i-1]=a[i];
				   a[i]=temp;	   
		        }
			}  
        else{
            if(a[i]<a[i-1]){
            temp=a[i-1];
            a[i-1]=a[i];
            a[i]=temp;			
		}
	} 
	    for(  i=1;i<n;i++){
		        System.out.println(+a[i]+"  ");
		    }
	    }
    } 
}  