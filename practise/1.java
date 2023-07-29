//gross salary
import java.util.Scanner;
class BasicSalary{
    public double basic(int b,char grade){
	double hra=0.2*b;
	double da=0.5*b;
    double pf=0.11*b;
    double allow=0;
	if(grade=='A'){
	allow = 1700;
	}
	if(grade=='B'){
	allow = 1500;
	}
	if(grade=='C'){
	allow = 1300;
	}
	double grosssalary;
	grosssalary = (b+hra+da+allow-pf);
	return grosssalary;
   }
}   


class Add {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Basic salary");
		int b=sc.nextInt(); 
		System.out.println("enter grade");
		char grade=sc.next().charAt(0); 
		
		BasicSalary obj = new BasicSalary();
		obj.basic(b,grade);
		System.out.println(obj.basic(b,grade));		
	}
}	
        