//print average of five number
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         float a,b,c,d,e;
         System.out.print("enter first number  \t");
         a=sc.nextFloat();
         System.out.print("enter second number  \t");
         b=sc.nextFloat();
         System.out.print("enter third number  \t");
         c=sc.nextFloat();
         System.out.print("enter fourth number  \t");
         d=sc.nextFloat();
         System.out.print("enter fifth number  \t");
         e=sc.nextFloat();         
         float x=(a+b+c+d+e)/5;
         System.out.println("total average of five number"+x);
         
     }
}                     
