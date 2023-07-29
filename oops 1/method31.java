//31) 9	99	999	9999	  99999 …….
import java.util.Scanner;
class series16{
    public void num(int m){ 
	int i,j,s=0;
    System.out.println("series ");
	    for(i=1;i<=m;i++){
		   for(j=1;j<=i;j++){
			    int a=9;
				System.out.print(a);
		    }
		 System.out.println();
		}
	}
}

	
class NumberTest{
    public static void main(String[]args){
	     series16 obj=new series16();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int m=sc.nextInt();
		obj.num(m);
		}
}	