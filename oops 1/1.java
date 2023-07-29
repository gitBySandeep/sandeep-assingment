
import java.util.Scanner;
class Test{
    Test(){
	System.out.println("Infobeans Foundation");
	}
	Test (int i)
	{
	System.out.println(i);
	}
	void m1(int a,int b)
	{
	System.out.println(a+b);
	}
	public static void main(String[]args){	
	   Test t1=new Test();
	   Test t=new Test(10);
	   t.m1(10,20);
	  }
	}