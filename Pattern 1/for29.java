//29) 1	11	111	1111	  11111	……

import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,n,j;
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		for(i=1;i<=n;i++){
		    for(j=1;j<=i;j++){
			    int a=1;
				System.out.print(a);
		    }
		  System.out.println();
		}
 	}
}	
	
	