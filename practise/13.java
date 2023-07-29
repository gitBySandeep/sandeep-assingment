//print convert fehrenhite to celcius
import java.util.Scanner;
class Tempreture{
    public void num(float n){
	int i;
	float celcius=(n-32)*5/9;
	System.out.println("tempreture in celcius"+celcius);
    }
	
}
	
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Tempreture");
		float n=sc.nextFloat();
		Tempreture obj=new Tempreture();
		obj.num(n);
	}
}	
	