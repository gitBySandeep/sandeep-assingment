//WAP to check wheather number is even or odd
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int a;
          System.out.println("enter  number ");
          a=sc.nextInt();
          
          
          if(a%2==0){
              System.out.println(" number is even= "+a);
              }
          else{
              System.out.println(" number is odd= "+a);
              }
        }
 }
