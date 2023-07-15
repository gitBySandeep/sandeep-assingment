//ladder array
import java.util.Scanner;
class Test{
    public static void main(String[]args){	
   	   
		Scanner sc=new Scanner(System.in);
		System.out.println( "enter the limit of row");
		int r=sc.nextInt();
        int rowcol ;
		int a[][]=new int[r][];
		 
		for(int i=0;i<r;i++){
		    System.out.print( "enter the coloum for row ");
		    rowcol=sc.nextInt();
		    a[i]=new int[rowcol];
		}
            for(int i=0;i<r;i++){
		        for(int j=0;j<a[i].length;j++){
		            System.out.print( "enter the coloum element ");	
		        a[i][j]=sc.nextInt();
		    }
        }
			for(int i=0;i<r;i++){
		        for(int j=0;j<a[i].length;j++){
		            System.out.print(a[i][j]+" "
					);
          	}
		 System.out.println(" ");   
		 }
    }
 }	