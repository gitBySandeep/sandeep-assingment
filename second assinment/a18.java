//print leap year
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int y;
          System.out.println("enter  any charecter ");
          y=sc.nextInt();
          
          if((y%4==0&&y%100!=0)||y%400==0){
               System.out.println("its leap year="+y);
           } 
          else {
               System.out.println("its not leap year "+y);
           }
        }
    }       
 
