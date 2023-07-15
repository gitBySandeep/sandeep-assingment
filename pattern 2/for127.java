/*
#
*#* 
**#** 
***#*** 
****#****
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		int i,j,c=1,s=1;
		for(i=1;i<=5;i++){
			for(int sp=5;sp>=c;sp--){
				System.out.print(" ");
			}
		   c++;
		   	
				for(j=1;j<=s;j++){
 					
				if(i==j)	
				System.out.print("#");
			    else
				System.out.print("*");
			}
			s=s+2;
			
			System.out.println();
		}
	}
}	
