import java.util.Scanner;
class Test{
    
	int a=5;
    static int b=10;
	
	public static void main(String[]args){
	
	Test t=new Test();
	System.out.println(t.a);
	System.out.println(t.b);
	 t.a=30;
	 t.b=20;
	 System.out.println(t.b);
	Test t1=new Test();
	System.out.println(t.a);
	System.out.println(t.b); 
	}
}
