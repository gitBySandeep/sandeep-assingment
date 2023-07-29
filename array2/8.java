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
		int x[][] = new int[3][3];

		System.out.println("element of array");
		for (int i = 0; i <x.length; i++) {
            for(int j=0;j<x[i].length;j++){
                x[i][j]=sc.nextInt();
		   }
	    }
		int max=0,row=0;
        System.out.println("bigest sum have which row ");		
        
            for(int j=0;j<x.length;j++){
                int sum=0;			
				for(int k=0;k<x.length;k++){
			    sum=sum+x[j][k];
				
		    }	
			
	    }	
	}
}	