//print elligible for voting or not
import java.util.Scanner;
class Voting{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int a;
         System.out.print("enter first number ");
         a=sc.nextInt();
         String c=(a>18)?("eligible for voting"):("not elligible"); 
         System.out.println(c);
     }
}
