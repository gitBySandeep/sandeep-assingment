//swap value of a and b
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int a,b,c,d;
         System.out.print("enter first number\t");
         a=sc.nextInt();
         System.out.print("enter second number\t");
         b=sc.nextInt();
         c=b;
         d=a;
         System.out.println("swap value of a\t"+c);
         System.out.print("swap value of b\t"+d);
     }
}
