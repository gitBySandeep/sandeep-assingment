//3) WAP to find out the sum of N natural number.
class Number{
    public void num(int a){
	    int sum=0;
		for(int i=0;i<=a;i++)
		sum=sum+i;
		System.out.println(sum);
	}
}	
class NumberTest{
    public static void main(String[]args){
	    Number obj=new Number();
		obj.num(5);
	}
}	