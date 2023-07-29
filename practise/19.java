//Write  a that wouid print the information (name,year of joining,Address)of three employees by creating a class named employee. the output shouid be follow
import java.util.Scanner;
class Company{
    private int year;
	private String name,address;
    public Company (String name,int year,String address){
	this.year=year;
	this.name=name;
	this.address=address;
	}
	public void max(){
	    System.out.println(name+\t " "      +year+\t   "   "+address);		
    }
}	
	

 class Test{
	public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int year;
		String name,address;
		Company obj[]=new Company[n];
		
		for(int i=0;i<obj.length;i++){
		System.out.println("enter"+(i+1)+"+Employee Name");
		name=sc.next();
		System.out.println("enter"+(i+1)+"+Employee Year of joining");
		year=sc.nextInt();
		System.out.println("enter"+(i+1)+"+employee Address");
		address=sc.next();
		obj[i]=new Company(name,year,address);
	    }
		System.out.println("Employee name   |   Year of joining   |    address    ");
        for(int i=0;i<obj.length;i++){
		obj[i].max();
	    }
    }		
}