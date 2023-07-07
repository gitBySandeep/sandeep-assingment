//check equal or not two number
import java.util.Scanner;
class Relation{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int a,b;
         System.out.print("enter first number\t");
         a=sc.nextInt();
         System.out.print("enter second number\t");
         b=sc.nextInt();
         int c=(a==b)?a:b;
         System.out.print(c);
      }
 }

