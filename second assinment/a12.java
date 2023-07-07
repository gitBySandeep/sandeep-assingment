/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int y,salary;
          System.out.println("enter year of service");
          y=sc.nextInt();
          System.out.println("enter salary");
          salary=sc.nextInt();
          
         
          if(y>5){
               System.out.println("salary with bonus"+(salary+(salary*5)/100));
             }
         else{
         System.out.println("salary without bonus"+salary);
         }
      } 
 }
