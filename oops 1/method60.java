//60) WAP to print Square, Cube and Square Root of all numbers from 1 to N
import java.util.Scanner;
class Square{
    public void num(int a,int b){
		int i,j,k;
        for (i = a; i <=b; i++) {
            j = i * i;
			k = i * i * i;
            System.out.println("  square root" + Math.sqrt(i));
			System.out.println(+j + " is a square of" + i);
			System.out.println(+k + " is a cube of" + i);
			j = 0;
			k = 0;
		}	
	}
}	
	
class NumberTest{
    public static void main(String[]args){
	    Square obj=new Square();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		System.out.println("enter number ");
		int b=sc.nextInt();
		obj.num(a,b);
	}
}	