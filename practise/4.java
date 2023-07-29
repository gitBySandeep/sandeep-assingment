//Wap to check alpabet is vowel or not
import java.util.Scanner;
class Alphabet{
    public void charecter(char c){
	    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
		    System.out.println("its Vowel");
		}
        else{		
		System.out.println("its consonent");
		}
	}	
}	
 
class Add {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Alphabet obj=new Alphabet();
		System.out.println("enter Alphabet");
		char c=sc.next().charAt(0);
	    obj.charecter(c);
	}
}		