// find max ,second max ,min,second min element in array 
import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("size of first array ");
		n = sc.nextInt();

		int x[] = new int[n];

		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		int min=2147483647,secondmin=2147483647;
		int max=-2147483647,secondmax=-2147483647;
		
		for(int i=0;i<n;i++){
		    if(min>x[i]){
			    secondmin=min;
				min=x[i];
			    }
                else if(x[i]<secondmin && min!=x[i]){			
		            secondmin=x[i];
		        }
		    
	  		
		    if(max<x[i]){
			    secondmax=max; 
				max=x[i];
			}
                else if(x[i]>secondmax && max!=x[i]){			
		        secondmax=x[i];
		    }
		}
		System.out.println("min :"+min+"second min:"+secondmin);
        System.out.println("max :"+max+"second max:"+secondmax);
    }
}
	