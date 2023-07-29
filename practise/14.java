//print convert fehrenhite to celcius
import java.util.Scanner;
class Factorial{
    public int num(int n){
	int fact=1,a=n;
	for(int i=0;i<n;i++){
	fact=fact*a;
	a--;
	}
	return fact;
   }
}
	
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		Factorial obj=new Factorial();
		int result=obj.num(n);
		System.out.println("factorial of number  :"+result);
	}
}	
	