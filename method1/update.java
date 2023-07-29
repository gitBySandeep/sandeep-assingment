//4)How to update and retrive  the value of a particular property of an object from anothor class(Let suppose the property is private) 
import java.util.Scanner;
class Mathes{
    private int a,b;
	public void num(int a,int b){
	    this.a = a ;
		this.b = b ;
	}	
    public void setA(int x){
        a=x;
	}
    
    public void setB(int y){
        b=y;
	}
    
    public int getA(){
        return a;
	}	
	
    public int getB(){
        return b;
	}	
}
class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
	    System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Mathes obj = new Mathes();
		obj.num(a,b);
		obj.setA(15);
		obj.setB(10);
		int result=obj.getA();
		int result1=obj.getB();
		System.out.println("after update a :"+result+" and after update b : "+result1);
	}
}	
 
 