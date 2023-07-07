//check vowel or not
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         char c;	
         System.out.print("enter any charecter\t");
         c=sc.next().charAt(0);
         String a=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')?("vowel"):("consonant");
         System.out.print(a);
     }
}
