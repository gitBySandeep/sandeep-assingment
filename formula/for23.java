// WAP to print all armstrong number from 101 to 999
import java.util.Scanner;
class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n=0,r,s=0,t=0;
		for(i=101;i<=999;i++){
		n=i;
		while(n>0){
		    r=n%10;
            n=n/10;
			s=r*r*r;
			t=t+s;
        }
		if(t==i)
        {		
		    System.out.println("armstrong number"+i);
		}
		t=0;
		}
    }
}	