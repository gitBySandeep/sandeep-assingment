//19) 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
import java.util.Scanner;
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter number");
		int n=sc.nextInt();
		float sum=0;
	    
		 
		for(int i=1;i<=n;i++){
		    float num=1f/i;
			sum=sum+num;
		}
		System.out.println(sum);
    }	
}	