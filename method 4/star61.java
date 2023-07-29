/*
#
*#* 
**#** 
***#*** 
****#****
*/	
import java.util.Scanner;
class Pattern61{
    public void star(int a){
		System.out.println("Pattern ");
        int i,j,c=1,s=1;
		for(i=1;i<=a;i++){
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
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern61 obj=new Pattern61();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
	    obj.star(a);
		}
}	
	