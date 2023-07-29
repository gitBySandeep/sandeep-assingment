class Addition{
    private int a,b;
	public void setData(int a,int b){
	   this.a=a;
		this.b=b;
	}
    public void setb(int b){
	   this.b=b;
	}
	
    public int getb(){
	   return b;
	}
}
 
class Testmain{
    public static void main(String[]args){ 
 	    Addition obj=new Addition();
		obj.setData(20,10);
		obj.setb(5);
	}
}	