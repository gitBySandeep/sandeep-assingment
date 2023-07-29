/*Q.22) C program to find nearest lesser and greater element in array
Given an array of N elements and we have to find nearest lesser and nearest greater element using C program.
Example:
    Input:
    Enter the number of elements for the arrray : 3  
 
    Enter the elements for array_1.. 
    array_1[0] : 1   
    array_1[1] : 2   
    array_1[2] : 3   
 
    Enter the number : 2 
 
    Output:
    Element lesser than 2 is : 1 
    Element greater than 2 is : 3
*/	
import java.util.Scanner;
class Array46{
    public void num(int a[]){
    	int i,j;
        System.out.println(" element which are big and small neighbour element");
		for (i=0; i<a.length; i++){
		    if(a[i+1]>a[i]&&a[i+1]<a[i+2]){
                System.out.println("Element lesses than " +a[i+1]+ " is : "+a[i] );
			    System.out.println("Element greater than " +a[i+1]+ " is : "+a[i+2] );
			}
	    }
	}
}	
class NumberTest{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		Array46 obj=new Array46();
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
	
		    
