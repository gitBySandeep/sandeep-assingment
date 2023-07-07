//swap without +,- operator
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int a,b;	
         System.out.print("enter first number\t");
         a=sc.nextInt();
         System.out.print("enter second number\t");
         b=sc.nextInt();
         a=a*b;
         b=a/b;
         a=a/b;
         System.out.println("value of a="+a);
         System.out.print("value of b="+b);
     }
}
