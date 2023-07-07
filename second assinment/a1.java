//smallest number in three
import java.util.Scanner;
class Smallest{
      public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int a,b,c;
         System.out.print("enter first number\t");
         a=sc.nextInt();
         System.out.print("enter second number\t");
         b=sc.nextInt();
         System.out.print("enter first number\t");
         c=sc.nextInt();
         if(a<b&&a<c){
              System.out.println("a is smallest=\t"+a);
         }else if(b<a&&b<c){
              System.out.println("b is smallest=\t"+b);
         }if(c<a&&c<b){
              System.out.println("c is smallest=\t"+c);
         }
   }
} 
