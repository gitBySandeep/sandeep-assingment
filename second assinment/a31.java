// WAP to check wheater number is positive or negative
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int n;
          System.out.println("enter  number ");
          n=sc.nextInt();
          
          
          if(n>0){
              System.out.println(" number is positive= "+n);
              }
          else{
              System.out.println(" number is negetive= "+n);
              }
        }
 }
