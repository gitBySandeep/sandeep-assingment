/* 
 1 1 1 1
 2 2 2 2
 3 3 3 3
 3 3 3 1
 */
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    	int x[][] = new int[4][4];
          
		  
		int min=2147483647,secondmin=2147483647;
		int max=-2147483647,secondmax=-2147483647;
		int secondminrow=0, secondmaxrow=0;
	    System.out.println("element of array");
		
		for (int i = 0; i <x.length; i++) {
            for(int j=0;j<x[i].length;j++){
                x[i][j]=sc.nextInt();
		   }
	    }
		
		for(int j=0;j<x.length;j++){
            int sum=0;			
		    for(int k=0;k<x.length;k++){
			    sum=sum+x[j][k];
		    	if(min>sum){
			        secondmin=min;
				    min=sum;
					secondminrow=j; 
			    }
                else if(sum<secondmin && min!=sum){			
		            secondmin=sum;
					secondminrow=j;
		        }
		    
	            if(max<sum){
			        secondmax=max; 
				    max=sum;
					secondmaxrow=j;
			    }
                else if(sum>secondmax && max!=sum){			
		            secondmax=sum;
					secondmaxrow=j;
		        }
		    }
		}	
		 
		System.out.println("second minimum row index"+secondminrow);
        System.out.println("second maximum row index"+secondmaxrow);
		
		    for(int j=0;j<x.length;j++){			
				for(int k=0;k<x.length;k++){
			        if(j==secondminrow){
					    System.out.print(x[secondmaxrow][k]);
					}
                    else if(j==secondmaxrow)
                    	System.out.print(x[secondminrow][k]);
                    else 
					System.out.print(x[j][k]);						
				}
            System.out.println(" ");				
	    }   
	}
}	