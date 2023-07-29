/* 8 7 3 
   9 5 12
   13 5 4
   */
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x[][] = new int[3][3];

		System.out.println("element of array");
		for (int i = 0; i <x.length; i++) {
            for(int j=0;j<x[i].length;j++){			
			    x[i][j] = sc.nextInt();
		    }
		}
		
		int temp=0;
		System.out.println("output");
		for (int i = 0; i <x.length; i++) {
            for(int j=0;j<x[i].length;j++){
                for(int k=j+1;k<x.length;k++){				
			        if(x[i][j]>x[i][k]){
				    temp=x[i][j];
					x[i][j]=x[i][k];
					x[i][k]=temp;
		        }
		    }
	    }
	}	
		for (int i = 0; i <x.length; i++) {
            for(int j=0;j<x[i].length;j++){
			   System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}	
	}
}	