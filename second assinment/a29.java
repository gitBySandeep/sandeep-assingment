//WAP to find greater among three number 

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int a,b,c;
          System.out.println("enter first number ");
          a=sc.nextInt();
          System.out.println("enter second number ");
          b=sc.nextInt();
          System.out.println("enter third number ");
          c=sc.nextInt();
          
          if(a>b&&a>c){
              System.out.println(" a is greatest= "+a);
              }
          else if(b>a&&b>c){
              System.out.println(" b is greatest= "+b);
              }
         else {
              System.out.println(" b is greatest= "+b);
             }
      }      
}
