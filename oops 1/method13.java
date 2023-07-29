//14) WAP to print alphabets in uppercase
import java.util.Scanner;
class alphabet{
    public void charecter(){ 
    System.out.println("alphabet in upper case ");
	for(char i='A';i<='Z';i++){
	    System.out.println(i);
		} 	
	}
}

class NumberTest{
    public static void main(String[]args){
	     alphabet obj=new alphabet();
		Scanner sc=new Scanner(System.in);
		obj.charecter();
		}
}	