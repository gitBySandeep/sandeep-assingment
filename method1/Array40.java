//Find the first non-repeating element in array of integers

import java.util.Scanner;
class Array40{
    public void num(int a[]){
    	int i,j;
		for (i = 0; i < a.length; i++) {
		  	for (j = 0; j < a.length; j++) {
				if(i!=j &&a[i]==a[j]){	
		  		    break;	
			}
			if(j==a.length){
		        System.out.println("first nonrepeat element :"+a[i]);		
		break;
	   }	
    }
   }	
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array40 obj=new Array40();
        System.out.println("size of first array ");
		n = sc.nextInt();
        int x[] = new int[n];
 		System.out.println("element of first array");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
        }
        obj.num(x);
	} 
}  
	
		    
