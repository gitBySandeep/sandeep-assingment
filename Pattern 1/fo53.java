import java.util.Scanner;
class Add{
    public static void main(String[]args){
		int n,n1,i,j=0,t,r1,r,s=1;
		  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		n=sc.nextInt();
		System.out.println("enter any number");
		n1=sc.nextInt();   
		 
		for(i=n;i<=n1;i++){
		    for(j=i;j>0;){
                r=j%10;
                for(r1=r;r>0;r--){
                s=s*r;
               }
		    } 
		}	 t=s;
			if(j==t)
			System.out.println(+t+" is a strong number");
			  t=0;
	}
}
    
      