// W.A.P to check the sign of given number. 
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int n;
          System.out.println("enter  any number  ");
          n=sc.nextInt();;
          
          if(n>0){
                System.out.println("positive");
            } 
             else if(n<0){
                System.out.println("negetive");
            } 
            else{
            System.out.println("zero");
       }
   }
}    
