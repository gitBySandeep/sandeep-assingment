/*
123456
54321
1234
321
12
1
*/
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
        for(int i=6;i>=1;i--){
			if(i%2==0){
				for(int j=1;j<=i;j++){
					System.out.print(j);
				}
			}	
			else{
                for(int j=i;j>=1;j--){
				System.out.print(j);
			    }
		    }
			System.out.println(" ");
		}
	}
}	