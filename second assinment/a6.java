//print division
import java.util.Scanner;
class Smallest{
      public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         char ch;
         System.out.print("enter any charecter \t ");
         ch=sc.next().charAt(0);
         
         if(ch>'A'&&ch<'Z'){
              System.out.println("uppercase letter\t"+ch);
         }
         else if(ch>'a'&&ch<'z'){
              System.out.println("lowercase letter\t"+ch);
         }else {
              System.out.println("special charecter\t"+ch);
         }

     }
} 
