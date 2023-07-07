//without using % get even or odd
import java.util.Scanner;
class Smallest{
      public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int n;
         System.out.print("enter any number \t ");
         n=sc.nextInt();
         
         if(n==(n/2)*2){
               System.out.print("even");
         }
         else{
            System.out.print("odd");
         }
      }
   }

