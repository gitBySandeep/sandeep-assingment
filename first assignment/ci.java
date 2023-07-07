//print compound interest
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int p;
         float r,t;
         System.out.print("enter principal\t");
         p=sc.nextInt();
         System.out.print("enter rate\t");
         r=sc.nextFloat();
         System.out.print("enter time\t");
         t=sc.nextFloat();
         float a=p*(1+r/100)*t;
         float ci=a-p;
         System.out.println("amount\t"+a);
         System.out.println("compound interest\t"+ci);
         
     }
}                     
