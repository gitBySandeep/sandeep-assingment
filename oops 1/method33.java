//33) WAP to print Alphabets in reversing order.
import java.util.Scanner;
class series18{
    public void num(){ 
    System.out.println("series ");
	    char ch;
        for (ch = 90; ch >= 65; ch--) {
		    System.out.println((char)(ch));	
		}
	}	
}

class NumberTest{
    public static void main(String[]args){
	     series18 obj=new series18();
		Scanner sc=new Scanner(System.in);
		obj.num();
		}
}	
