//Find the first repeating element in array of integers

import java.util.Scanner;
class Array39{
    public void num(int a[]){
    	int i,j,c=0;
		for (i = 0; i <a.length; i++) {
			for (j= i+1; j < a.length; j++){
		  	    if (a[i]==a[j])
				break;
			}
				c++;
			if(c==1)
			System.out.println("first repeat element :"+a[i]);
            break;			
		}			
	}	
} 	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array39 obj=new Array39();
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
	
		    
