//print electricity bill
import java.util.Scanner;
class ElecricityBill{
    private int bill=0;
	public int num(int u){
	if(u>1&&u<100){
	bill=u*10;
    this.bill=bill;
	}
	if(u>100&&u<200){
	bill=u*15;
     this.bill=bill;  
    }
	
	if(u>200&&u<300){
	bill=u*20;
	 this.bill=bill;
    }
	
	if(u>300){
	bill=u*25;
	 this.bill=bill;
    }
	return bill;
	}
}
	
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter unit");
		int u=sc.nextInt();
		ElecricityBill sandeep=new ElecricityBill();
		int result=sandeep.num(u);
	    System.out.println("total electricity bill :"+result);
	}
}	
	