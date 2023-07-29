/*
123456
54321
1234
321
12
1 
*/

import java.util.Scanner;
class Pattern36{
    public void star(int a){
		System.out.println("Pattern ");
		for(int i=6;i>=1;i--){
			if(i%2==0){
				for(int j=1;j<=i;j++){
					System.out.print(j);
				}
			}	
			else{
                for(int j=i;j>=1;j--){
				System.out.print(j);
			    }
		    }
			System.out.println(" ");
		}

	}
}	
	
	
class NumberTest{
    public static void main(String[]args){
	    Pattern36 obj=new Pattern36();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row ");
		int a=sc.nextInt();
		obj.star(a);
		}
}	