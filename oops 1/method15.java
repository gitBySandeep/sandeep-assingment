//16) …... -6	-3	0	3	6	9	……. n terms
import java.util.Scanner;
class series1{
    public void num(int a){ 
    System.out.println("series ");
	for(int i=-6;i<=a;i=i+3){
	    System.out.println(i);
		} 	
	}
}

class NumberTest{
    public static void main(String[]args){
	     series1 obj=new series1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		obj.num(a);
		}
}	