//lower case to upper case
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         char c;	
         System.out.print("enter any charecter\t");
         c=sc.next().charAt(0);
         char ch;
         ch=(c>'A'&&c<'Z')?(char)c:(c>'a'&&c<'z')?(char)(c-32):(char)c;
         System.out.print(ch);
     }
}
