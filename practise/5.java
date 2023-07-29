//Wap to given value in range of 18 and 100 print elligible for voting or not
import java.util.Scanner;
class Elligible{
    public void age(int a){  
	   if(a>=18&&a<=100){
		System.out.println("Elligible for voting");
        }	    
        else{
		System.out.println("Not Elligible for voting");
        }
	}
}	
class Add {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int a=sc.nextInt();
		Elligible obj=new Elligible();
	    obj.age(a);
		
	}
}