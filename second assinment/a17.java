//Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).//
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          char c;
          System.out.println("enter  any charecter ");
          c=sc.next().charAt(0);
          
         if(c>'A'&&c<'Z'){
               System.out.println("its uppercase letter");
             } 
         else {
               System.out.println("its lowercase letter");
           }
        }
 }       
