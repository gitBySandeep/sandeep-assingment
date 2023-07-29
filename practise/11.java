//print bill
import java.util.Scanner;
class Food{
    public void num(int Bill,int pizza,int puffs,int coldrinks,int a,int b,int c){
	Bill=pizza*a+puffs*b+coldrinks*c;	
	System.out.println("Total Bill  :"+Bill);
	} 
}
	
class Add{
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int pizza=100;
		int puffs=20;
		int coldrinks=10;
		System.out.println("how many pizza which you want");
		int a=sc.nextInt();
	    System.out.println("how many puffs which you want");
		int b=sc.nextInt();
		System.out.println("how many coldrinks which you want");
		int c=sc.nextInt();
		int Bill=0;
		Food obj=new Food();
		obj.num(Bill,pizza,puffs,coldrinks,a,b,c);
	}
}