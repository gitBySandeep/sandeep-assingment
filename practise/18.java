//print pattern
import java.util.Scanner;
class Pattern{
	public void star(int n){
	int i,j;
	    for(i=1;i<=n;i++){
	        for(j=1;j<=i;j++){
		        if(i==j){
		            System.out.print("*");
	            }
				else{
					System.out.print(" ");
				}	
		    }
			System.out.println();
            
        }
    }
}	
	
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		Pattern sandeep=new Pattern();
		sandeep.star(n);
	}
}	
	