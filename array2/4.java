//20,30,60
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];

		System.out.println("element of array");
		for (int i = 0; i <a.length; i++) {
            for(int j=0;j<a[i].length;j++){			
			    a[i][j] = sc.nextInt();
		    }
		}
		
		System.out.println("output");
		for (int i = 0; i <a.length; i++) {
            for(int j=0;j<a[i].length;j++){			
			    if(i<j){
				    System.out.println(a[i][j]+" ");
		        }
		    }
	    }
	}
}	