//30) 1+11+111+1111+11111+…

import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int i,j,a=1,s=0;
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
	 	int n=sc.nextInt();
		for(i=1;i<=n;i++){
			System.out.println(a);
			s=s+a;
			a=a*10+1;
		}
		System.out.println(s);
	}
}	
	
	