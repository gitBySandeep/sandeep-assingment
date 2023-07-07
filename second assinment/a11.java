/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.*/
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int Q,p;
          System.out.println("enter Quantity");
          Q=sc.nextInt();
          p=Q*100;
          System.out.println(p);
         
          if(p>1000){
               System.out.println("price with discount"+(p-(p*10)/100));
             }
         else{
         System.out.println("no discount"+p);
         }
      } 
 }       
