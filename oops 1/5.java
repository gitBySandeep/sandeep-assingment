class Addition{
    private int a,b;
	public void setData(int x,int y){
	    a=x;
		b=y;
	}
    public void add(){
	    System.out.print(a+b);
	}
}
 
class Testmain{
    public static void main(String[]args){ 
 	    Addition obj=new Addition();
		obj.setData(20,10);
		obj.add();
	}
}	