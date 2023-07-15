//43) WAP to convert binary number into decimal number

import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,c=0,sum=0,pow=1,r=0;
		System.out.print("enter  number ");
		n = sc.nextInt();
		
	    while(n>0){
		   r=n%10; 
			n=n/10;
			c++;
		for(int i=1;i<c;i++){	
		 pow=pow*2;
		}
        
		if(r==1)
		sum=sum+pow;
		pow=1;
		} 
		System.out.println(sum);
	}
}	