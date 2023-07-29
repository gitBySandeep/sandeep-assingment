//30) 1+11+111+1111+11111+…. 
import java.util.Scanner;
class series15{
    public void num(int m){ 
	int i,a=1,s=0;
    System.out.println("series ");
	    for(i=1;i<=m;i++){
			System.out.println(a);
			s=s+a;
			a=a*10+1;
		}
		System.out.println("total sum of series ");
		System.out.println(s);
	}
}

	
class NumberTest{
    public static void main(String[]args){
	     series15 obj=new series15();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int m=sc.nextInt();
		obj.num(m);
		}
}	