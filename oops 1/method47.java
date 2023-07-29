//47) WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;
class Table{
    public void num(int a,int b){
	int i,j;	
        for( i=a;i<=b;i++){
	        System.out.println("table of :"+i);
	        for( j=1;j<=10;j++){
		        System.out.println(i+"x"+j+"="+i*j);
	        }
	    }	
	}	
}	

class NumberTest{
    public static void main(String[]args){
	    Table obj=new Table();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to start table");
		int a=sc.nextInt();
		System.out.println("enter number to end table");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	
