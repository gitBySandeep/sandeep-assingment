//number is divisible by 5 and 11
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int n;
          System.out.println("enter  number ");
          n=sc.nextInt();
          
           if(n%5==0&&n%11==0){
              System.out.println("divisible by 5 and 11="+n);
              }
          else{
              System.out.println(" not divisible by 5 and 11="+n);
              }
    }
 }
