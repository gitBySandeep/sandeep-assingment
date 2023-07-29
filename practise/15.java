//print prime number
import java.util.Scanner;
class Prime{
    public void num(){
	int i,j,count=0;
	for( i=1;i<=100;i++){
	    count=0;
	     for( j=2;j<=i/2;j++){
		    if(i%j==0)
			count++;
	    }
	if(count==0)
	    System.out.println(i);
	}
   }
}
	
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Prime obj=new Prime();
		obj.num();	
	}
}	
	