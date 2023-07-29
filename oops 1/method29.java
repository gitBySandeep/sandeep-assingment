//29) 1	11	111	1111	  11111	……
import java.util.Scanner;
class series14{
    public void num(int m){ 
    System.out.println("series ");
		for(int i=1;i<=m;i++){
		    for(int j=1;j<=i;j++){
			    int a=1;
				System.out.print(a);
		    }
		  System.out.println();
		}
	}
}
	
class NumberTest{
    public static void main(String[]args){
	     series14 obj=new series14();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int m=sc.nextInt();
		obj.num(m);
		}
}	