//WAP to find ASCII value of a charecter
import java.util.Scanner;
class ASCII{
    public void num(char c){
		System.out.println("ASCII "+(int)(c)); 
    }
}	
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any charecter");
		char c=sc.next().charAt(0);
		ASCII obj=new ASCII();
		obj.num(c);
	}
}