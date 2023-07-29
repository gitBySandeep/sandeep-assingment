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
                x[i][j]=sc.nextInt();
		   }
	    }
        System.out.println("reverse");		
        for (int i = 0; i <x.length; i++) {
            for(int j=x[i].length-1;j>=0;j--){			
			    System.out.print(x[i][j]+" ");
		    }	
			System.out.println();
		} 
	}
}	