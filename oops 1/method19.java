//19) 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
		
import java.util.Scanner;
class series4{
    public void num(int a){ 
    System.out.println("sum of series");
	    float sum=0;
	    for(int i=1;i<=a;i++){
		    float num=1f/i;
			sum=sum+num;
		}
		System.out.println(sum);
	
	}
}
	
class NumberTest{
    public static void main(String[]args){
	     series4 obj=new series4();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	