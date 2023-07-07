//all relational op[erator
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int a,b;
         boolean c,d,e,f,g,h;
         System.out.print("enter first number\t");
         a=sc.nextInt();
         System.out.print("enter second number\t");
         b=sc.nextInt();
         c=(a>b);
         d=(a<b);
         e=(a>=b);
         f=(a<=b);
         g=(a==b);
         h=(a!=b);
         System.out.println(c);
         System.out.println(d);
         System.out.println(e);
         System.out.println(f);
         System.out.println(g);
         System.out.println(h);
         
     }
}                     
