//15) WAP to print alphabets in lowercase
import java.util.Scanner;
class alphabet{
    public void charecter(){ 
    System.out.println("alphabet in lowercase ");
	for(char i='a';i<='z';i++){
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