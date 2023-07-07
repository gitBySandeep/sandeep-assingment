//WAP to find greater among two number 

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int a,b;
          System.out.println("enter first number ");
          a=sc.nextInt();
          System.out.println("enter second number ");
          b=sc.nextInt();
          
          if(a>b){
              System.out.println(" a is greatest= "+a);
              }
          else{
              System.out.println(" b is greatest= "+b);
              }
      }      
}
