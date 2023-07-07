//smallest number in three
import java.util.Scanner;
class Smallest{
      public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int age;
         System.out.print("enter age \t");
         age=sc.nextInt();
         
         if(age>18){
              System.out.println("elligible for voting");
         }else {
              System.out.println("not elligible for voting");
         }
   }
} 
