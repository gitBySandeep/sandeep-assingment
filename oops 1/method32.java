//32) A	b	C	d	E	f	G	h	…… n terms 
import java.util.Scanner;
class series17{
    public void num(){ 
    System.out.println("series ");
	    char ch;
        for (ch = 65; ch <= 90; ch++) {
			if (ch % 2 == 1) {
				System.out.print(" " + ch + "   ");
			} else
				System.out.print((char) (+(ch + 32)));
		}
	}
}

	
class NumberTest{
    public static void main(String[]args){
	     series17 obj=new series17();
		Scanner sc=new Scanner(System.in);
		obj.num();
		}
}	
