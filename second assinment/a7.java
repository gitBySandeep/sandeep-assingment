import java.util.Scanner;
class Greater{
      public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          int n;
          System.out.println("enter number");
          n=sc.nextInt();
          
          if(n>0){
             System.out.println("positive number");
          }else if(n<0){
              System.out.println("negetive  number");
          }else{
              System.out.println("  number is zero");
          }
     }
}           
