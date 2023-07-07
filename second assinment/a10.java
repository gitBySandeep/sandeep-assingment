//Take values of length and breadth of a rectangle from user and check  it is square or not
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int length,breath;
          System.out.println("enter length");
          length=sc.nextInt();
          System.out.println("enter breath");
          breath=sc.nextInt();
          
         
          if(length==breath){
               System.out.println("square");
             }
         else{
         System.out.println("rectangle");
         }
      } 
 }       
