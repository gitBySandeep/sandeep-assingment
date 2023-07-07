//print division
import java.util.Scanner;
class Smallest{
      public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int a,b;
         System.out.print("enter first number \t ");
         a=sc.nextInt();
         System.out.print("enter second number \t ");
         b=sc.nextInt();
         
         if(a==b){
              System.out.println("both number are equal");
         }else if(a>b) {
              System.out.println("a is greater\t"+a);
         }else{
              System.out.println("b is greater\t"+b);
         }
     }
} 
