//1) WAP to print a statement 100 number of times.
class Number{
    public void num(int a){
	    for(int i=0;i<=a;i++)
		System.out.println(i);
	}
}	
class NumberTest{
    public static void main(String[]args){
	    Number obj=new Number();
		obj.num(100);
	}
}	
