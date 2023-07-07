// Print number between 1 to 5 in word format 
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int n;
          System.out.println("enter  number ");
          n=sc.nextInt();
          
          
          if(n==1){
              System.out.println("one");
              }
           else if(n==2){
              System.out.println("two");
              }
           else if(n==3){
              System.out.println("three");
              }
          else if(n==1){
              System.out.println("four");
              }
          else if(n==5){
              System.out.println(" one");
              }
          else{
             System.out.println("default");
        }
    }
 }
