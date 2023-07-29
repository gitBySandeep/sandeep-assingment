//17) 1 	2	 4	 7	 11	 16 	…… n terms

import java.util.Scanner;
class series2{
    public void num(int a){ 
    System.out.println("series ");
	int j=1;
	for(int i=1;i<=a;i++){
	    System.out.println(j);
		j=j+i;
		} 	
	}
}

class NumberTest{
    public static void main(String[]args){
	     series2 obj=new series2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	