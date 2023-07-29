//61) WAP to find out all the leap years between two entered years
import java.util.Scanner;
class LeapYear{
    public void num(int a,int b){
		int i,j,k;
        for (i = a; i <= b; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.println(+i + " leap year" );
            }
		}	
	}
}	
	
class NumberTest{
    public static void main(String[]args){
	    LeapYear obj=new LeapYear();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year ");
		int a=sc.nextInt();
		System.out.println("enter Year ");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	