//WAP to exchange value of two variable  using third variable and wihout using third variable
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int a,b,c;
          System.out.println("enter first number ");
          a=sc.nextInt();
          System.out.println("enter second number ");
          b=sc.nextInt();
         //wihout using third variable
          a=a+b;
          b=a-b;
          a=a-b;
          System.out.println("a= "+a);
          System.out.println("b= "+b);              
         //wihout using third variable
          c=a;
          a=b;
          System.out.println("a= "+c);
          System.out.println("b= "+a);              
         
  
   }
 }
