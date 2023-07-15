//Q.4 Write a program to sort the array
import java.util.Scanner;
class Test{
    public static void main(String[]args){	
   	   
		Scanner sc=new Scanner(System.in);
		System.out.println( "enter the limit of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		
        System.out.println( "enter the number ");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		
		System.out.println("shorting" );
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
			   if(a[i]>=a[j]){
                int tem=0;
		        tem=a[i];
                 a[i]=a[j];
                a[j]=tem;		  
	        }
        }
	  System.out.println(a[i]);
    }
  }	
} 

